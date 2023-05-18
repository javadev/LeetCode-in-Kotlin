# Write your MySQL query statement below
# #Medium #Database #2023_05_18_Time_454_ms_(90.82%)_Space_0B_(100.00%)
select e.name
from employee m left join employee e
on m.managerid = e.id
group by e.name
having count(e.name) > 4;