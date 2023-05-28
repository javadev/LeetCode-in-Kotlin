# Write your MySQL query statement below
# #Medium #Database #2023_05_28_Time_881_ms_(90.47%)_Space_0B_(100.00%)
select customer_id
from customer
group by customer_id
having count(distinct product_key)=(select count(*) from product);
