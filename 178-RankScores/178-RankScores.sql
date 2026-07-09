-- Last updated: 09/07/2026, 15:11:37
# Write your MySQL query statement below
SELECT 
  score,
  DENSE_RANK() OVER (ORDER BY score DESC)
AS 'rank'
FROM Scores;