# Write your MySQL query statement below
Select P.Product_id, Round(ifnull(sum(p.price*U.units)/sum(U.units),0),2) as Average_price
From Prices P
left join UnitsSold U
on P.product_id = U.Product_id
AND u.purchase_date BETWEEN p.start_date AND p.end_date
group by P.product_id;