# Write your MySQL query statement below
Select query_name, Round(avg(rating/position),2) as Quality, Round(avg(rating<3)*100,2) as poor_query_percentage
From Queries
Group by query_name;