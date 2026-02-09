# Write your MySQL query statement below
select P.Project_id, Round(avg(E.experience_years),2) As average_years
From Project P
left join Employee E
on P.employee_id = E.employee_id
group by project_id;