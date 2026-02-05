# Write your MySQL query statement below
Select E.name, B.bonus
from Employee E
Left join Bonus B
on E.empID = B.empID
where B.bonus < 1000 Or B.bonus IS NULL;