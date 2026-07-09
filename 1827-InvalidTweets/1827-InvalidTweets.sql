-- Last updated: 09/07/2026, 15:08:46
# Write your MySQL query statement below
SELECT tweet_id
FROM Tweets
WHERE CHAR_LENGTH(content)>15