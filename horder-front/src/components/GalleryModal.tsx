import React, { useState, useEffect } from 'react';
import ImageGallery from './ImageGallery';

interface GalleryModalProps {
  guitarId: number;
  onClose: () => void;
}

interface ImageData {
  id: number;
  urlPath: string;
}

const GalleryModal: React.FC<GalleryModalProps> = ({ guitarId, onClose }) => {
    const [images, setImages] = useState<ImageData[]>([]);
    const [selectedImage, setSelectedImage] = useState<string | null>(null);
  
    useEffect(() => {
      fetch(`http://localhost:8080/horder/images/${guitarId}/getAllPhotos`)
        .then((response) => response.json())
        .then((data) => setImages(data))
        .catch((error) => console.error('Error fetching guitar photos:', error));
    }, [guitarId]);
  
    const openImage = (imageUrl: string) => {
      setSelectedImage(imageUrl);
    };
  
    const closeImage = () => {
      setSelectedImage(null);
    };
  
    return (
      <div className="fixed inset-0 flex justify-center items-center z-50">
        <div className="absolute inset-0 bg-black opacity-70" onClick={onClose}></div>
        <div className="bg-white p-6 rounded-lg max-w-4xl overflow-y-auto relative z-50">
          <button
            className="absolute top-2 right-2 text-gray-700 hover:text-gray-900"
            onClick={onClose}
          >
            <svg
              xmlns="http://www.w3.org/2000/svg"
              className="h-6 w-6"
              fill="none"
              viewBox="0 0 24 24"
              stroke="currentColor"
            >
              <path
                strokeLinecap="round"
                strokeLinejoin="round"
                strokeWidth="2"
                d="M6 18L18 6M6 6l12 12"
              />
            </svg>
          </button>
          <ImageGallery images={images} onImageClick={openImage} />
        </div>
        {selectedImage && (
          <div className="fixed inset-0 flex justify-center items-center z-50">
            <div className="absolute inset-0 bg-black opacity-70" onClick={closeImage}></div>
            <div className="bg-white p-4 rounded-lg max-w-4xl overflow-y-auto relative z-50">
              <button
                className="absolute top-2 right-2 text-gray-700 hover:text-gray-900"
                onClick={closeImage}
              >
                <svg
                  xmlns="http://www.w3.org/2000/svg"
                  className="h-6 w-6"
                  fill="none"
                  viewBox="0 0 24 24"
                  stroke="currentColor"
                >
                  <path
                    strokeLinecap="round"
                    strokeLinejoin="round"
                    strokeWidth="2"
                    d="M6 18L18 6M6 6l12 12"
                  />
                </svg>
              </button>
              <img src={selectedImage} alt="Enlarged" className="max-w-full max-h-screen" />
            </div>
          </div>
        )}
      </div>
    );
  };
  
  export default GalleryModal;