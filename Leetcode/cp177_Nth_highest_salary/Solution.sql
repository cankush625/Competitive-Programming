CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  RETURN (
      # Write your MySQL query statement below.
      SELECT (CASE WHEN (SELECT COUNT(*) from Employee) < N THEN NULL 
      WHEN ((SELECT COUNT(DISTINCT Salary) FROM Employee) < N) THEN NULL ELSE
      (SELECT Salary FROM (SELECT DISTINCT Salary FROM Employee ORDER BY Salary DESC LIMIT N) AS Salary1 ORDER BY Salary ASC LIMIT 1) END)
  );
END