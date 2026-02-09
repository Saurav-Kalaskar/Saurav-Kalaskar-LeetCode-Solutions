# Write your MySQL query statement below
Select E1.name 
From Employee E1
Join Employee E2
on E1.id = E2.managerid
GROUP BY E1.id, E1.name
HAVING COUNT(E2.id) >= 5;