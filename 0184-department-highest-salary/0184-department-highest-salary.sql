# Write your MySQL query statement below
-- SELECT DEPT.name AS Department, EMP.name AS Employee, EMP.salary AS 

-- Salary FROM Department DEPT, Employee EMP WHERE

-- EMP.departmentId = DEPT.id AND (EMP.departmentId, salary) IN 

-- (SELECT departmentId, MAX (salary) FROM Employee GROUP BY 

-- departmentId)

with dtp_Max_sal as (select departmentId, max(salary)as Salary from Employee
group by departmentId)
select
(select name from Department where id=e.departmentId) Department,
e.name Employee,
dtp_Max_sal.salary
from dtp_Max_sal, Employee e
where e.salary=dtp_Max_sal.salary
and e.departmentId=dtp_Max_sal.departmentId