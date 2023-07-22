# Write your MySQL query statement below
# #Easy #Database #SQL_I_Day_2_Select_and_Order
# #2023_06_22_Time_1321_ms_(33.12%)_Space_0B_(100.00%)
select employee_id,
(case when (employee_id%2=1 and name not like 'M%') then salary else 0 end )as bonus
from employees
order by employee_id;
