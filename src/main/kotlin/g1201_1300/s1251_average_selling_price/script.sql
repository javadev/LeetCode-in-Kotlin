# Write your MySQL query statement below
# #Easy #Database #2023_06_10_Time_1371_ms_(76.11%)_Space_0B_(100.00%)
SELECT p.product_id,
ROUND(SUM(p.price * u.units) / SUM(u.units), 2) AS average_price
FROM
Prices AS p
NATURAL JOIN
UnitsSold  AS u
WHERE
u.purchase_date BETWEEN p.start_date AND p.end_date
GROUP BY p.product_id;
