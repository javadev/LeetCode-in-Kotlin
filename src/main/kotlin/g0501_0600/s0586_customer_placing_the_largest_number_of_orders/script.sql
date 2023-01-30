# Write your MySQL query statement below
# #Easy #LeetCode_Curated_SQL_70 #Database #SQL_I_Day_8_Function
# #2023_01_30_Time_768_ms_(44.85%)_Space_0B_(100.00%)
select customer_number from orders group by customer_number order by count(customer_number) desc limit 1