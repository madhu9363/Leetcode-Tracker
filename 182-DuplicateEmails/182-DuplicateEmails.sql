-- Last updated: 09/07/2026, 15:11:30
# Write your MySQL query statement below
SELECT email
FROM person
GROUP BY email
Having COUNT(email) >1;