-- Last updated: 09/07/2026, 15:11:40
SELECT MAX(salary) AS SecondHighestSalary
FROM Employee
WHERE salary < (SELECT MAX(salary) 
                FROM Employee);
