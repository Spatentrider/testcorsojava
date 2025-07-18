SELECT title, release_year
FROM film
WHERE release_year > 2005
ORDER BY title; 

SELECT rental.*
FROM rental
JOIN customer ON rental.customer_id = customer.customer_id
WHERE customer.first_name = 'MARY' AND customer.last_name = 'SMITH';

SELECT film.title, COUNT(rental.rental_id) AS noleggi
FROM film
JOIN inventory ON film.film_id = inventory.film_id
JOIN rental ON inventory.inventory_id = rental.inventory_id
GROUP BY film.film_id, film.title
ORDER BY noleggi;