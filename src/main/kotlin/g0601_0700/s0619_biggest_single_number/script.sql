# Write your MySQL query statement below
# #Easy #Database #2023_05_20_Time_656_ms_(90.69%)_Space_0B_(100.00%)
SELECT MAX(num) AS num
FROM (SELECT num, COUNT(num)
      FROM MyNumbers
      GROUP BY num
      HAVING COUNT(num) = 1) t
      
