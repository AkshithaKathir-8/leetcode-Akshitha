-- Last updated: 8/12/2026, 8:55:03 AM
# Write your MySQL query statement below
SELECT class
FROM Courses
GROUP BY class
HAVING COUNT(student) >= 5;