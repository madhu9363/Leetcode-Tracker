-- Last updated: 09/07/2026, 15:10:07
# Write your MySQL query statement below
SELECT c.class
FROM Courses c
GROUP BY class
Having COUNT(student) >=5;