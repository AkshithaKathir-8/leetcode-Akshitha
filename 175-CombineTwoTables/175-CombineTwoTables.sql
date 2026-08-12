-- Last updated: 8/12/2026, 9:00:38 AM
# Write your MySQL query statement below
select Person.firstName, Person.lastName, Address.city ,Address.state 
FROM Person
LEFT JOIN Address
ON Person.personId = Address.personId;