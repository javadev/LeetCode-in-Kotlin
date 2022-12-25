# Write your MySQL query statement below
# #Medium #Database #2022_10_18_Time_292_ms_(85.14%)_Space_0B_(100.00%)
select Score, DENSE_RANK() OVER(order by Score Desc) as "Rank" from Scores order by "Rank" Asc;
