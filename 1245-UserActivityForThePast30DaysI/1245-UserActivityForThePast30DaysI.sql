-- Last updated: 09/07/2026, 15:09:33
# Write your MySQL query statement below
SELECT activity_date AS day, count(DISTINCT user_id) AS active_users
FROM Activity a
WHERE activity_date BETWEEN '2019-06-28' AND '2019-07-27'
GROUP BY day