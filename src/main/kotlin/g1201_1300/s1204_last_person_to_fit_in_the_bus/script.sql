# Write your MySQL query statement below
# #Medium #Database #2023_06_10_Time_1476_ms_(82.95%)_Space_0B_(100.00%)
WITH ctx AS(
SELECT person_name, SUM(weight) OVER(ORDER BY turn ASC) AS running_sum
FROM queue
)

SELECT person_name
FROM ctx
WHERE running_sum <= 1000
ORDER BY running_sum DESC
LIMIT 1;
