# Write your MySQL query statement below
# #Medium #Database #2023_06_22_Time_1602_ms_(35.78%)_Space_0B_(100.00%)
select
  s.user_id
  , round(count(case when action = 'confirmed' then 1 end)
    / cast(count(*) as decimal(7,2)), 2) as confirmation_rate
  from
    Signups s
  left join
    Confirmations c
  on c.user_id = s.user_id
  group by 1
  