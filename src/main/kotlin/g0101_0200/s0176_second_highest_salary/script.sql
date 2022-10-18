# Write your MySQL query statement below
# #Medium #Database #SQL_I_Day_4_Union_and_Select
# #2022_10_18_Time_219_ms_(92.54%)_Space_0B_(100.00%)
SELECT ifnull(
                (SELECT distinct(Salary)
                 FROM Employee
                 ORDER BY Salary DESC
                 LIMIT 1
                 OFFSET 1), NULL) SecondHighestSalary;
