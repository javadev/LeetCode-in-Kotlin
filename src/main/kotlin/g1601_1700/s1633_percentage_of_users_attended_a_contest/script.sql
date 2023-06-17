# Write your MySQL query statement below
# #Easy #Database #2023_06_17_Time_1556_ms_(93.74%)_Space_0B_(100.00%)
select contest_id,
round(count(contest_id)/(
  select count(distinct user_id) from Users
)*100.0,2) as percentage
from Register
group by contest_id
order by percentage desc, contest_id asc