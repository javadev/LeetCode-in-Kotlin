# Write your MySQL query statement below
# #Easy #Database #SQL_I_Day_10_Where #2023_06_14_Time_1582_ms_(52.96%)_Space_0B_(100.00%)
select u.name, sum(t.amount) as balance from Users as u join Transactions as t on u.account = t.account group by u.name having balance > 10000
