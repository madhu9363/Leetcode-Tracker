-- Last updated: 09/07/2026, 15:10:11
# Write your MySQL query statement below
SELECT O.customer_number
FROM Orders o
GROUP BY Customer_number
ORDER BY COUNT(Customer_number) DESC
LIMIT 1;
