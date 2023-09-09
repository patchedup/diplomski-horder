import React, { useEffect, useState } from 'react';
import GuitarCard from './GuitarCard';

interface Image {
  id: number;
  urlPath: string;
}
interface Guitar {
  id: number;
  manufacturerOfGuitar: string;
  modelOfGuitar:string;
  price:number;
  yearOfProduction: number;
  stateOfGuitar: string;
  typeOfGuitar: string;
  typeOfMagnets: string;
  tuners: string;
  typeOfWood: string;
  description: string;
  images: Image[]; // Add images property

}

const GuitarList: React.FC = () => {
  const [guitars, setGuitars] = useState<Guitar[]>([]);

  useEffect(() => {
    // Fetch data from your backend API
    fetch('http://localhost:8080/horder/guitars/all')
      .then((response) => response.json())
      .then((data) => setGuitars(data))
      .catch((error) => console.error('Error fetching data:', error));
  }, []);

  return (
    <div className="grid grid-cols-1 sm:grid-cols-2 md:grid-cols-3 lg:grid-cols-4 gap-4">
      {guitars.map((guitar) => (
        <GuitarCard key={guitar.id} guitar={guitar} />
      ))}
    </div>
  );
};

export default GuitarList;
