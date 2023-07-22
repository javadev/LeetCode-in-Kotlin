# Write your MySQL query statement below
# #Easy #Database #2023_07_02_Time_839_ms_(96.77%)_Space_0B_(100.00%)
SELECT teacher_id,COUNT(DISTINCT subject_id) as cnt FROM Teacher
GROUP BY teacher_id;
