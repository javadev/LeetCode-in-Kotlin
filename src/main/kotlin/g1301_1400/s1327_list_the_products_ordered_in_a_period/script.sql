# Write your MySQL query statement below
# #Easy #Database #2023_06_12_Time_1324_ms_(61.30%)_Space_0B_(100.00%)
SELECT * FROM (
  SELECT
    a.product_name,
    SUM(b.unit) as unit
  FROM Products a
  LEFT JOIN Orders b
  ON a.product_id = b.product_id
  WHERE b.order_date BETWEEN '2020-02-01' AND '2020-02-29'
  GROUP BY a.product_name
) AS d
GROUP BY d.product_name
HAVING d.unit >= 100
