-- CREATE DATABASE film_booking;
-- use film_booking;

-- select * from movies_details;

-- insert INTO movies_details values(1,'Lover.jpg','Enterainment','Lover');
--  insert INTO movies_details values(2,'shaitan.jpg','Horror','Shaitan');
--  insert INTO movies_details values(3,'Manjummel_Boys_poster.jpg','Enterainment','Manjummel Boys');
--  insert INTO movies_details values(4,'j.jpg','Drama/Family','J Baby');
--  insert INTO movies_details values(5,'premalu.jpg','Romance/Comedy','Premalu');

-- use film_booking;
-- update movies_details
-- SET image = 'Manjummel_Boys_poster.jpg'
-- where movie_id = 3;


use film_booking;

DELETE FROM movies_details
WHERE movie_id = 6;
-- insert INTO movies_details values(3,'Manjummel_Boys_poster.jpg','Enterainment','Manjummel Boys');
