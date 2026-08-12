-- Last updated: 8/12/2026, 8:48:11 AM
# Write your MySQL query statement below
select sell_date, count( DISTINCT product ) as num_sold ,
    
    GROUP_CONCAT( DISTINCT product order by product ASC separator ',' ) as products
    
        FROM Activities GROUP BY sell_date order by sell_date ASC;