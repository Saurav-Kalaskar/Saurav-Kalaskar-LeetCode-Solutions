# Write your MySQL query statement below
Select Eu.Unique_id As Unique_id, e.name As name 
from Employees E
left Join EmployeeUNI Eu
on Eu.id = E.id