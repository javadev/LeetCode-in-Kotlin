# Write your MySQL query statement below
# #Easy #LeetCode_Curated_SQL_70 #Database #SQL_I_Day_5_Union
# #2023_05_31_Time_806_ms_(54.41%)_Space_0B_(100.00%)
select distinct author_id as id from Views where author_id = viewer_id order by author_id;
