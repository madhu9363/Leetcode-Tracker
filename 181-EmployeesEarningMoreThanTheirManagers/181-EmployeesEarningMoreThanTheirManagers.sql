-- Last updated: 09/07/2026, 15:11:33
# Write your MySQL query statement below
SELECT e1.name AS Employee
FROM Employee e1
JOIN Employee e2
ON e1.managerId = e2.id
Where e1.salary >e2.salary;