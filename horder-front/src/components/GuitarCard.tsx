import React, { useState, useEffect } from 'react';
import ImageGallery from './ImageGallery'; // Import the ImageGallery component
import GalleryModal from './GalleryModal'; // Import the GalleryModal component


interface Guitar {
  id: number;
  manufacturerOfGuitar: string;
  modelOfGuitar: string;
  price: number;
  yearOfProduction: number;
  stateOfGuitar: string;
  typeOfGuitar: string;
  typeOfMagnets: string;
  tuners: string;
  typeOfWood: string;
  description: string;
}

interface GuitarCardProps {
  guitar: Guitar;
}

const GuitarCard: React.FC<GuitarCardProps> = ({ guitar }) => {
  const [guitarPhotoUrl, setGuitarPhotoUrl] = useState<string | null>(null);
  const [showGallery, setShowGallery] = useState(false);

  useEffect(() => {
    // Fetch guitar photo URL from your backend API
    fetch(`http://localhost:8080/horder/images/${guitar.id}/getTopImage`)
      .then((response) => response.json())
      .then((data) => {
        // Extract the URL from the response
        const photoUrl = data.urlPath;
        setGuitarPhotoUrl(photoUrl);
      })
      .catch((error) => console.error('Error fetching guitar photo:', error));
  }, [guitar.id]);
 
  return (
    <div className="bg-white rounded-lg shadow-lg overflow-hidden m-4 w-64">
      <div className="relative w-full h-64">
        {guitarPhotoUrl && (
          <img
            src={guitarPhotoUrl}
            alt={guitar.manufacturerOfGuitar}
            className="w-full h-full object-cover rounded-t-lg"
          />
        )}
      </div>
      <div className="p-4">
        <h2 className="text-xl font-semibold">{guitar.manufacturerOfGuitar}</h2>
        <h2 className="text-xl  text-gray-500 font-semibold">{guitar.modelOfGuitar}</h2>
        <h2 className="text-l text-red-400 font-semibold">{guitar.price}</h2>

        <p className="text-gray-700 italic font-light mt-2">{guitar.description}</p>
      <button
        className="bg-blue-500 text-white px-4 py-2 mt-4 w-full rounded-md hover:bg-blue-600"
        onClick={() => setShowGallery(true)} // Open the gallery on button click
      >
        See More
      </button>

      {/* Conditionally render the GalleryModal component */}
      {showGallery && (
        <GalleryModal
          guitarId={guitar.id}
          onClose={() => setShowGallery(false)} // Close the gallery
        />
      )}
    </div>
    </div>
  );
};

export default GuitarCard;






