# Write your MySQL query statement below
Select A1.Machine_id, Round(avg(A2.timestamp - A1.timestamp),3) as processing_time
From Activity A1
join Activity A2
on A1.machine_id = A2.machine_id
And A1.process_id = A2.process_id
where A1.Activity_type ='start'
And A2.Activity_type = 'end'
Group By A1.machine_id;