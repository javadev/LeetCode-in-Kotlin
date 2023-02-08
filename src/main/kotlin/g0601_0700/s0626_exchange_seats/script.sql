# Write your MySQL query statement below
# #Medium #Database #2023_02_09_Time_502_ms_(50.56%)_Space_0B_(100.00%)
SELECT CASE
    WHEN s.id = ( SELECT COUNT(*) FROM Seat ) AND MOD(s.id,2) = 1 THEN s.id
    WHEN MOD(s.id,2) = 0 THEN s.id - 1
    ELSE s.id + 1
    END AS id,
    s.student
FROM Seat AS s
ORDER BY id
