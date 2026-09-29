SELECT a.name, COUNT(book_id)
FROM authors AS a
LEFT JOIN books AS b  ON a.author_id = b.author_id
GROUP BY a.author_id
ORDER BY a.name;