# Write your MySQL query statement below
select name as customers
from customers c1
left join Orders o1 on c1.id = o1.customerid
where o1.id is null