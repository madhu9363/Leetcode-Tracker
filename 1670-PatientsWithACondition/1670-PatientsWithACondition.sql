-- Last updated: 09/07/2026, 15:08:57
# Write your MySQL query statement below
SELECT *
FROM Patients p 
WHERE p.conditions LIKE 'DIAB1%'
  OR p.conditions LIKE '% DIAB1%'