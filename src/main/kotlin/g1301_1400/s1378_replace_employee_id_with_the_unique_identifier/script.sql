# Write your MySQL query statement below
# #Easy #Database #2023_06_15_Time_2452_ms_(54.86%)_Space_0B_(100.00%)
select u.unique_id, e.name
from Employees e
left join EmployeeUNI u
on e.id = u.id;
