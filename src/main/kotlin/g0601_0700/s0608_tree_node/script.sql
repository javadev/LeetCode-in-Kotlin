# Write your MySQL query statement below
# #Medium #LeetCode_Curated_SQL_70 #Database #SQL_I_Day_4_Union_and_Select
# #2023_02_05_Time_794_ms_(48.38%)_Space_0B_(100.00%)
SELECT
    id,
    CASE
        WHEN p_id IS NULL THEN 'Root'
        WHEN p_id IN (SELECT id FROM Tree) AND id IN (SELECT p_id FROM Tree) THEN 'Inner'
        ELSE 'Leaf'
    END AS type
FROM Tree
