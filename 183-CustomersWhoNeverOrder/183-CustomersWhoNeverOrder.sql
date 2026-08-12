-- Last updated: 8/12/2026, 9:00:08 AM
# Write your MySQL query statement below
SELECT name as Customers
from Customers
where id not in (
    select customerId
    from Orders
);