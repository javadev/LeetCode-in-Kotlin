# Write your MySQL query statement below
# #Medium #LeetCode_Curated_SQL_70 #Database #SQL_I_Day_9_Control_of_Flow
# #2023_06_06_Time_990_ms_(47.36%)_Space_0B_(100.00%)
SELECT stock_name, SUM(CASE WHEN operation='Sell' THEN price ELSE -price END) AS capital_gain_loss
FROM Stocks GROUP BY stock_name;
