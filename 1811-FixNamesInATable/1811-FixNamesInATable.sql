-- Last updated: 09/07/2026, 15:08:48
# Write your MySQL query statement below
SELECT u.user_id,
    CONCAT(UPPER(LEFT(name,1)),LOWER(SUBSTRING(name,2)))AS name
FROM Users u
ORDER BY user_id;
