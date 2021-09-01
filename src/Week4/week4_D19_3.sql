-- https://leetcode.com/problems/second-highest-salary/
-- time: 5m
-- Create by haerin on 2021/08/12

Select Max(Salary) AS SecondHighestSalary  FROM Employee where Salary < (Select Max(Salary) FROM Employee);