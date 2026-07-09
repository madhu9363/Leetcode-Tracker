-- Last updated: 09/07/2026, 15:09:39
# Write your MySQL query statement below
SELECT p.product_name,s.year,s.price
FROM Sales s
INNER JOIN product p
ON s.product_id = p.product_id;