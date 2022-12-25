# Write your MySQL query statement below
# #Easy #Database #SQL_I_Day_5_Union #2022_10_12_Time_473_ms_(54.97%)_Space_0B_(100.00%)
SELECT FirstName, LastName, City, State
FROM Person LEFT JOIN Address USING (PersonId)
