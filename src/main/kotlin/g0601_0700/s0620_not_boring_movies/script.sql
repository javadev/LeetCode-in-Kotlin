# Write your MySQL query statement below
# #Easy #Database #2023_02_06_Time_305_ms_(59.80%)_Space_0B_(100.00%)
select id, movie, description, rating from Cinema
WHERE mod(id,2) = 1
and
description not LIKE '%boring%'
order by rating DESC;
