-- Last updated: 09/07/2026, 15:10:12
# Write your MySQL query statement below
SELECT c.name
FROM Customer c
WHERE referee_id!=2 
  OR referee_id IS NULL;