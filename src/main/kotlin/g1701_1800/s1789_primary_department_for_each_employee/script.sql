# Write your MySQL query statement below
# #Easy #Database #2023_06_18_Time_1033_ms_(77.87%)_Space_0B_(100.00%)
select e1.employee_id, case when e2.department_id is null then e1.department_id else e2.department_id end as department_id
from employee e1
left join (select * from employee where primary_flag = 'Y')e2 on e1.employee_id = e2.employee_id
group by e1.employee_id, department_id
