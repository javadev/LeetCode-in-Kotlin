# Write your MySQL query statement below
# #Easy #Database #2023_06_23_Time_686_ms_(64.74%)_Space_0B_(100.00%)
select employee_id from employees where manager_id not in (select distinct (employee_id) from employees)
AND salary < 30000 order by employee_id

