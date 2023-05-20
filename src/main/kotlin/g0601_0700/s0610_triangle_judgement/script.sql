# Write your MySQL query statement below
# #Easy #Database #2023_05_19_Time_464_ms_(72.35%)_Space_0B_(100.00%)
SELECT *,
    CASE WHEN x+y>z AND y+z>x AND z+x>y THEN 'Yes' ELSE 'No' END AS triangle
FROM Triangle
