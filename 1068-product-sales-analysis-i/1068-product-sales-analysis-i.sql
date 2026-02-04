# Write your MySQL query statement below
Select p.product_name, s.year, s.price
from sales s
Left Join product p
On s.product_id = p.Product_id