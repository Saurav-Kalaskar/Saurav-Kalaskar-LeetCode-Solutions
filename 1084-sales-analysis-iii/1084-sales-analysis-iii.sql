# Write your MySQL query statement below
Select s.product_id, product_name
from sales s
left join product p
on s.product_id = p.product_id
group by s.product_id
having 
min(sale_date) >= cast('2019-01-01' as date) and
max(sale_date) <= cast('2019-03-31' as date) 