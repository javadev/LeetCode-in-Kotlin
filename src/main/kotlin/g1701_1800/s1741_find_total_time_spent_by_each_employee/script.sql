# Write your MySQL query statement below
# #Easy #Database #SQL_I_Day_8_Function #2023_06_16_Time_1101_ms_(51.40%)_Space_0B_(100.00%)
SELECT event_day AS "day", emp_id, SUM(out_time) - SUM(in_time) AS total_time
FROM Employees
GROUP BY event_day, emp_id
