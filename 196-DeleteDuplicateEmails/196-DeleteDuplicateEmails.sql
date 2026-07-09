-- Last updated: 09/07/2026, 15:11:22
# Write your MySQL query statement below
DELETE p1
FROM Person P1
join person p2
ON p1.email = p2.email AND p1.id> p2.id