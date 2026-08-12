-- Last updated: 8/12/2026, 8:54:46 AM
# Write your MySQL query statement below
select *, if(x+y>z and y+z>x and x+z>y, "Yes","No") as triangle from triangle