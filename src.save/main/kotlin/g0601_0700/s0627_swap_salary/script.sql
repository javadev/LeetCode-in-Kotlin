# Write your MySQL query statement below
# #Easy #Database #SQL_I_Day_2_Select_and_Order #2023_02_09_Time_400_ms_(51.04%)_Space_0B_(100.00%)
UPDATE Salary SET sex = CASE WHEN sex = 'm' THEN 'f' ELSE 'm' END WHERE TRUE;
