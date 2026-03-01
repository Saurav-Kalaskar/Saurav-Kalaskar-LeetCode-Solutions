# Write your MySQL query statement below
select employee_id, department_id
from employee 
where primary_flag ="y"
OR employee_id in (
    select employee_id
    from employee
    Group by employee_id
    having count(*) = 1
) 
