# Write your MySQL query statement below
Select distinct v.customer_id, count(V.visit_id) as Count_no_trans
From Visits v
left join transactions T
on V.visit_id = T.visit_id
where transaction_id IS NULL
Group By Customer_id
order by Count_no_trans asc;
