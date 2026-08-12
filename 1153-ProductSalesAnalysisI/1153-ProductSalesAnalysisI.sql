-- Last updated: 8/12/2026, 8:50:17 AM
# Write your MySQL query statement below
SELECT
    product_name,
    year,
    price
FROM Sales
LEFT JOIN Product
ON Sales.product_id = Product.product_id;