# Write your MySQL query statement below
# #Easy #LeetCode_Curated_SQL_70 #Database #SQL_I_Day_8_Function
# #2023_01_10_Time_790_ms_(45.04%)_Space_0B_(100.00%)
select distinct(player_id), min(event_date) as first_login
from activity
group by player_id