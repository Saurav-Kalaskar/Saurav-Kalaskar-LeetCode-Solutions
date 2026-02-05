# Write your MySQL query statement below
Select w1.id
From Weather w1
join weather w2
on w1.recordDate = Date_add(w2.recordDate, interval 1 day)
where w1.Temperature > w2.Temperature