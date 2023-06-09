# Write your MySQL query statement below
# #Easy #LeetCode_Curated_SQL_70 #Database #SQL_I_Day_10_Where
# #2023_06_02_Time_1881_ms_(79.36%)_Space_0B_(100.00%)
SELECT P.product_id, P.product_name
FROM Product P
INNER JOIN Sales S ON P.product_id = S.product_id
GROUP BY P.product_id
HAVING MIN(S.sale_date) >= '2019-01-01' AND MAX(S.sale_date) <= '2019-03-31';
