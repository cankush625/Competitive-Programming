# Write your MySQL query statement below
SELECT MAX(Salary) AS SecondHighestSalary from Employee where Salary < (SELECT MAX(Salary) FROM Employee);