# Write your MySQL query statement below
# #Medium #Database #2023_06_13_Time_2387_ms_(59.80%)_Space_0B_(100.00%)
with cte as
(SELECT name, COUNT(RATING) as cnt,
DENSE_RANK() over(order by COUNT(RATING) desc, name asc) as rnk FROM MovieRating r
INNER JOIN Users u ON r.user_id = u.user_id
GROUP BY u.user_id
limit 1),

cte2 as
(SELECT title, avg(rating) as avgr from MovieRating r
INNER JOIN Movies m ON r.movie_id = m.movie_id
where month(created_at) = 2
group by r.movie_id
order by avg(rating) desc, title asc
limit 1)

select name as results from cte
union all
select title from cte2
