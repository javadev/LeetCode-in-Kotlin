# Write your MySQL query statement below
# #Medium #Database #2023_06_22_Time_2358_ms_(73.89%)_Space_0B_(100.00%)
with cte1 as (SELECT 'Low Salary' AS category,SUM(CASE WHEN INCOME<20000 THEN 1 ELSE 0 END ) AS accounts_count from Accounts),
cte2 as(SELECT 'Average Salary' AS category,SUM(CASE WHEN INCOME BETWEEN 20000 AND 50000 THEN 1 ELSE 0 END ) AS accounts_count from Accounts),
cte3 as (SELECT 'High Salary' AS category,SUM(CASE WHEN INCOME> 50000 THEN  1 ELSE 0 END) AS accounts_count
FROM Accounts)
SELECT * from cte3
UNION ALL
SELECT * FROM cte1
UNION ALL
SELECT * FROM cte2
