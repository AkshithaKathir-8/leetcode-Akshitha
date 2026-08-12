-- Last updated: 8/12/2026, 9:00:19 AM
# Write your MySQL query statement below
SELECT e2.name as Employee
FROM employee e1
INNER JOIN employee e2 ON e1.id = e2.managerID
WHERE
e1.salary < e2.salary