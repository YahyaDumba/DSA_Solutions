# Write your MySQL query statement below
SELECT name
FROM SalesPerson
WHERE sales_id NOT IN
(
    SELECT o.sales_id
    From Orders o
    LEFT JOIN Company c
    On o.com_id = c.com_id
    WHERE c.name LIKE 'RED')
