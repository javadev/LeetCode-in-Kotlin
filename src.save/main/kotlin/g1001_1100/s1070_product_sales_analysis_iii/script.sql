# Write your MySQL query statement below
# #Medium #Database #2023_05_31_Time_1561_ms_(95.47%)_Space_0B_(100.00%)
SELECT
    a.product_id, sale_year AS first_year, quantity, price
FROM
(
    SELECT
        *,
        RANK() OVER(PARTITION BY product_id ORDER BY sale_year) as rk
    FROM
        Sales
) AS a
LEFT JOIN
    Product AS p
ON
    a.product_id = p.product_id
WHERE
    rk = 1
