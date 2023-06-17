# Write your MySQL query statement below
# #Easy #Database #2023_06_17_Time_1556_ms_(93.74%)_Space_0B_(100.00%)
with ucount as (
  select count(user_id) as total from Users
)
Select contest_id,
round((count(contest_id) / total)*100, 2) as percentage
from Register, ucount
group by contest_id
order by percentage desc, contest_id asc;