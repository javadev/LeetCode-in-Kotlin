# Write your MySQL query statement below
# #Easy #Database #SQL_I_Day_5_Union #2023_06_14_Time_2771_ms_(54.68%)_Space_0B_(100.00%)
select customer_id, COUNT(*) as count_no_trans
from visits v left join transactions t
on v.visit_id = t.visit_id
where transaction_id is null
group by customer_id
