# Write your MySQL query statement below
# #Easy #Database #2023_06_01_Time_1268_ms_(94.71%)_Space_0B_(100.00%)
select project_id,round(avg(
  experience_years
),2) as average_years from Project p
left join
Employee e on p.employee_id=e.employee_id group by p.project_id;
