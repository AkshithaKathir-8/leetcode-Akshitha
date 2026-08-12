-- Last updated: 8/12/2026, 8:59:45 AM
# Write your MySQL query statement below
SELECT w1.id
FROM Weather w1
JOIN Weather w2
ON w1.recordDate= DATe_ADD(w2.recordDate, INTERVAL 1 DAY)
WHERE w1.temperature>w2.temperature;