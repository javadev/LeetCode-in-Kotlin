# Write your MySQL query statement below
# #Easy #Database #2023_06_18_Time_1263_ms_(53.93%)_Space_0B_(100.00%)
SELECT tweet_id
FROM Tweets
WHERE LENGTH(content) > 15
