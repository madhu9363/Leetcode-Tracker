-- Last updated: 09/07/2026, 15:10:03
# Write your MySQL query statement below
SELECT *
FROM Cinema c
WHERE id % 2=1
   AND description<>'boring'
ORDER BY rating DESC;

