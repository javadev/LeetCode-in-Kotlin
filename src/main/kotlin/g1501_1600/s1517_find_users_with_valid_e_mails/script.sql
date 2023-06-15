# Write your MySQL query statement below
# #Easy #Database #2023_06_15_Time_1278_ms_(77.30%)_Space_0B_(100.00%)
select * from Users
where mail REGEXP '^[a-zA-Z][a-zA-Z0-9_.-]*@leetcode.com' and mail LIKE '%@leetcode.com'
