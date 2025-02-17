# Write your MySQL query statement below
select employee_id
from employees as e
where manager_id not in (select employee_id from employees) and salary < 30000
order by employee_id asc