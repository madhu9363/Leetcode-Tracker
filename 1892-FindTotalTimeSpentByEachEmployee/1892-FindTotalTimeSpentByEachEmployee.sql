-- Last updated: 09/07/2026, 15:08:43
# Write your MySQL query statement below
SELECT e.event_day AS day,e.emp_id, SUM(out_time-in_time) AS total_time
FROM Employees e
GROUP BY event_day,emp_id
