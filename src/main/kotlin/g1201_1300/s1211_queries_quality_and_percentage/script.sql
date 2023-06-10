# Write your MySQL query statement below
# #Easy #Database #2023_06_10_Time_1176_ms_(80.10%)_Space_0B_(100.00%)
select query_name,
ROUND(AVG(rating / position), 2) AS quality,
round(SUM(rating<3)/count(query_name)*100,2) as poor_query_percentage
from queries
group by query_name;