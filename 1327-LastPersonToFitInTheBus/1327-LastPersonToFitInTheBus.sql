-- Last updated: 8/12/2026, 8:49:14 AM
# Write your MySQL query statement below
SELECT person_name
FROM
(
    SELECT
        person_name,
        turn,
        SUM(weight) OVER (ORDER BY turn) AS total_weight
    FROM Queue
) q
WHERE total_weight <= 1000
ORDER BY total_weight DESC
LIMIT 1;