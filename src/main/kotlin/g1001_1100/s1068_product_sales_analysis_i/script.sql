# Write your MySQL query statement below
# #Easy #Database #2023_05_30_Time_1897_ms_(79.88%)_Space_0B_(100.00%)
Select Product.product_name, Sales.sale_year, Sales.price
from Sales
Inner Join Product On Product.product_id = Sales.product_id
