# Write your MySQL query statement below
# #Easy #LeetCode_Curated_SQL_70 #Database #SQL_I_Day_9_Control_of_Flow
# #2023_06_07_Time_2035_ms_(14.53%)_Space_0B_(100.00%)
select u.name,IFNULL(sum(r.distance), 0) as travelled_distance
from Users u left join Rides r
on u.id = r.user_id
group by u.id
order by travelled_distance desc,name asc