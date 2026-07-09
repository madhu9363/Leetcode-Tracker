-- Last updated: 09/07/2026, 15:11:29
# Write your MySQL query statement below
SELECT c.name AS Customers
FROM Customers c
LEFT JOIN Orders o
ON c.id = o.customerId
WHERE o.customerId IS NULL;