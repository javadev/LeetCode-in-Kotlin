# Write your MySQL query statement below
# #Hard #Database #2023_02_02_Time_529_ms_(51.80%)_Space_0B_(100.00%)
with new_group as(
    select id,visit_date,people,id - row_number() over(order by id) as new
    from Stadium
    where people >= 100
    )
    select id,visit_date,people
    from new_group
    where new in(
        select new
        from new_group
        group by new
        having count(id) >= 3
        );