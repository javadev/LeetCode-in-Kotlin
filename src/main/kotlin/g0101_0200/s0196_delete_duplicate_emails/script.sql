# Write your MySQL query statement below
# #Easy #Database #SQL_I_Day_2_Select_and_Order #2022_10_18_Time_593_ms_(94.17%)_Space_0B_(100.00%)
DELETE FROM Person
WHERE Id NOT IN (SELECT id FROM (SELECT Email, MIN(Id) AS id FROM Person GROUP BY Email) t)