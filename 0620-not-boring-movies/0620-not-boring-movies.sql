# Write your MySQL query statement below
Select id, movie, description, rating
from Cinema
where mod(id,2)=1
AND Description != "boring"
Group by id
order by rating Desc;