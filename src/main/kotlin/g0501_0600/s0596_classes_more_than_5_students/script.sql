# Write your MySQL query statement below
# #Easy #Database #2023_02_01_Time_484_ms_(50.92%)_Space_0B_(100.00%)
select class
from Courses
group by class
having count(student) >= 5
