# Write your MySQL query statement below
select person.email
from person
group by email
having count(*) > 1;