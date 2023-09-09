import React from 'react';

interface ImageData {
  id: number;
  urlPath: string;
}

interface ImageGalleryProps {
  images: ImageData[];
  onImageClick: (imageUrl: string) => void;
}


const ImageGallery: React.FC<ImageGalleryProps> = ({ images, onImageClick }) => {
    return (
      <div className="grid grid-cols-1 sm:grid-cols-2 md:grid-cols-3 lg:grid-cols-4 gap-4">
        {images.map((image) => (
          <div key={image.id} className="relative">
            <img
              src={image.urlPath}
              alt={`Thumbnail ${image.id}`}
              className="cursor-pointer object-cover w-full h-48 sm:h-64 md:h-72 rounded-lg"
              onClick={() => onImageClick(image.urlPath)}
            />
          </div>
        ))}
      </div>
    );
  };

export default ImageGallery;
