-- Last updated: 09/07/2026, 15:11:24
# Write your MySQL query statement below
SELECT 
    Department,
    Employee,
    Salary
FROM (
    SELECT 
        d.name AS Department,
        e.name AS Employee,
        e.salary AS Salary,
        DENSE_RANK() OVER (PARTITION BY e.departmentId ORDER BY e.salary DESC) AS rnk
    FROM Employee e
    JOIN Department d 
    ON e.departmentId = d.id
) ranked_table
WHERE rnk <= 3;
