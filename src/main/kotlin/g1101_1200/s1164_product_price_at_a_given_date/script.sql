# Write your MySQL query statement below
# #Medium #Database #2023_06_05_Time_774_ms_(91.86%)_Space_0B_(100.00%)
WITH before_change_date AS (
    SELECT DISTINCT
        product_id,
        new_price as price,
        RANK() Over(Partition By product_id Order by change_date DESC) as rnk
    FROM Products
    WHERE change_date <= '2019-08-16'
)

SELECT
    product_id,
    price
FROM before_change_date
WHERE rnk = 1

UNION

SELECT
  DISTINCT product_id,
  10 as price
FROM Products
WHERE product_id not in (
      SELECT  product_id
      FROM Products
      WHERE change_date <= '2019-08-16'
)
