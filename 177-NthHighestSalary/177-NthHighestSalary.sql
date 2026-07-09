-- Last updated: 09/07/2026, 15:11:38
CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  SET N= N-1;
  RETURN (
      # Write your MySQL query statement below.
      SELECT DISTINCT salary
      FROM Employee
      ORDER BY salary DESC
      LIMIT 1 OFFSET N

  );
END