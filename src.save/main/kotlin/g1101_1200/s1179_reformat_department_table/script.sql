# Write your MySQL query statement below
# #Easy #Database #2023_05_25_Time_815_ms_(90.95%)_Space_0B_(100.00%)
SELECT DISTINCT id
     , SUM(CASE WHEN "month" = 'Jan' THEN revenue END) AS Jan_Revenue
     , SUM(CASE WHEN "month" = 'Feb' THEN revenue END) AS Feb_Revenue
     , SUM(CASE WHEN "month" = 'Mar' THEN revenue END) AS Mar_Revenue
     , SUM(CASE WHEN "month" = 'Apr' THEN revenue END) AS Apr_Revenue
     , SUM(CASE WHEN "month" = 'May' THEN revenue END) AS May_Revenue
     , SUM(CASE WHEN "month" = 'Jun' THEN revenue END) AS Jun_Revenue
     , SUM(CASE WHEN "month" = 'Jul' THEN revenue END) AS Jul_Revenue
     , SUM(CASE WHEN "month" = 'Aug' THEN revenue END) AS Aug_Revenue
     , SUM(CASE WHEN "month" = 'Sep' THEN revenue END) AS Sep_Revenue
     , SUM(CASE WHEN "month" = 'Oct' THEN revenue END) AS Oct_Revenue
     , SUM(CASE WHEN "month" = 'Nov' THEN revenue END) AS Nov_Revenue
     , SUM(CASE WHEN "month" = 'Dec' THEN revenue END) AS Dec_Revenue
FROM Department
GROUP BY id
