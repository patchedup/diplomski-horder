-- Insert Fender guitar data
 insert into guitars (manufacturer_of_guitar, model_of_guitar,price, year_of_production, state_of_guitar, type_of_guitar, type_of_magnets, tuners, type_of_wood, description) values ('Fender', 'Stratocaster', 89999,2020, 'KAO_NOVO', 'ELEKTRICNA', 'HSS', 'Standard Tuners', 'Maple', 'A versatile electric guitar.');

-- Insert Gibson guitar data
insert into guitars (manufacturer_of_guitar, model_of_guitar,price, year_of_production, state_of_guitar, type_of_guitar, type_of_magnets, tuners, type_of_wood, description) values ('Gibson', 'Les Paul',234999, 1995, 'DOBRO', 'ELEKTRICNA', 'SINGL_KOIL', 'Grover Rotomatics', 'Mahogany', 'Classic rock electric guitar.');

-- Insert Taylor guitar data
insert into guitars (manufacturer_of_guitar, model_of_guitar, price,year_of_production, state_of_guitar, type_of_guitar, type_of_magnets, tuners, type_of_wood, description) values ('Taylor', '214ce', 145000,2018, 'NOVO', 'AKUSTICNA', 'PIEZO', 'Taylor Chrome', 'Spruce', 'High-quality acoustic guitar.');

-- Insert Ibanez guitar data
insert into guitars (manufacturer_of_guitar, model_of_guitar, price,year_of_production, state_of_guitar, type_of_guitar, type_of_magnets, tuners, type_of_wood, description) values ('Ibanez', 'RG550',34999, 2015, 'KAO_NOVO', 'ELEKTRICNA', 'HSS', 'Ibanez Tuners', 'Mahogany', 'Versatile electric guitar with a sleek design.');

-- Insert Martin guitar data
insert into guitars (manufacturer_of_guitar, model_of_guitar, price,year_of_production, state_of_guitar, type_of_guitar, type_of_magnets, tuners, type_of_wood, description) values ('Martin', 'D-28',349000, 2022, 'NOVO', 'AKUSTICNA', 'PIEZO', 'Martin Deluxe', 'Rosewood', 'High-quality acoustic guitar with rich tones.');

-- Insert PRS guitar data
insert into guitars (manufacturer_of_guitar, model_of_guitar,price, year_of_production, state_of_guitar, type_of_guitar, type_of_magnets, tuners, type_of_wood, description) values ('PRS', 'Custom 24', 123000,2019, 'KAO_NOVO', 'ELEKTRICNA', 'HAMBAKERI', 'PRS Phase III', 'Maple', 'Premium electric guitar with a unique design.');

-- Insert Epiphone guitar data
insert into guitars (manufacturer_of_guitar, model_of_guitar, price,year_of_production, state_of_guitar, type_of_guitar, type_of_magnets, tuners, type_of_wood, description) values ('Epiphone', 'Les Paul Standard', 23000,2021, 'KAO_NOVO', 'ELEKTRICNA', 'HAMBAKERI', 'Epiphone Deluxe', 'Mahogany', 'Affordable electric guitar with classic tones.');

insert into image_table (url_path, guitar_id) values ('https://horder-bucket.s3.eu-north-1.amazonaws.com/top-images/fender_stratocaster.jpg', 1);
insert into image_table (url_path, guitar_id) values ('https://horder-bucket.s3.eu-north-1.amazonaws.com/top-images/gibson_les_paul.jpg', 2);
insert into image_table (url_path, guitar_id) values ('https://horder-bucket.s3.eu-north-1.amazonaws.com/top-images/taylor_214ce.jpg', 3);
insert into image_table (url_path, guitar_id) values ('https://horder-bucket.s3.eu-north-1.amazonaws.com/top-images/ibanez_rg550.jpg', 4);
insert into image_table (url_path, guitar_id) values ('https://horder-bucket.s3.eu-north-1.amazonaws.com/top-images/martin_d28.jpg', 5);
insert into image_table (url_path, guitar_id) values ('https://horder-bucket.s3.eu-north-1.amazonaws.com/top-images/custom24.jpg', 6);
insert into image_table (url_path, guitar_id) values ('https://horder-bucket.s3.eu-north-1.amazonaws.com/top-images/epiphone_les_paul_standard.jpg', 7);

insert into all_image_table (url_path, guitar_id) values ('https://horder-bucket.s3.eu-north-1.amazonaws.com/top-images/fender_stratocaster.jpg', 1);
insert into all_image_table (url_path, guitar_id) values ('https://horder-bucket.s3.eu-north-1.amazonaws.com/top-images/gibson_les_paul.jpg', 2);
insert into all_image_table (url_path, guitar_id) values ('https://horder-bucket.s3.eu-north-1.amazonaws.com/top-images/gibson_les_paul.jpg', 2);
insert into all_image_table (url_path, guitar_id) values ('https://horder-bucket.s3.eu-north-1.amazonaws.com/top-images/gibson_les_paul.jpg', 2);
insert into all_image_table (url_path, guitar_id) values ('https://horder-bucket.s3.eu-north-1.amazonaws.com/top-images/gibson_les_paul.jpg', 2);
insert into all_image_table (url_path, guitar_id) values ('https://horder-bucket.s3.eu-north-1.amazonaws.com/top-images/gibson_les_paul.jpg', 2);

insert into all_image_table (url_path, guitar_id) values ('https://horder-bucket.s3.eu-north-1.amazonaws.com/top-images/taylor_214ce.jpg', 3);
insert into all_image_table (url_path, guitar_id) values ('https://horder-bucket.s3.eu-north-1.amazonaws.com/top-images/ibanez_rg550.jpg', 4);
insert into all_image_table (url_path, guitar_id) values ('https://horder-bucket.s3.eu-north-1.amazonaws.com/top-images/martin_d28.jpg', 5);
insert into all_image_table (url_path, guitar_id) values ('https://horder-bucket.s3.eu-north-1.amazonaws.com/top-images/custom24.jpg', 6);
insert into all_image_table (url_path, guitar_id) values ('https://horder-bucket.s3.eu-north-1.amazonaws.com/top-images/epiphone_les_paul_standard.jpg', 7);

