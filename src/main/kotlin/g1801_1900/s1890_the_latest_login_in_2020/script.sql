# Write your MySQL query statement below
# #Easy #Database #SQL_I_Day_8_Function #2024_03_30_Time_1280_ms_(43.62%)_Space_0B_(100.00%)
SELECT user_id, MAX(time_stamp) AS last_stamp
FROM Logins
WHERE YEAR(time_stamp) = '2020'
GROUP BY 1;
