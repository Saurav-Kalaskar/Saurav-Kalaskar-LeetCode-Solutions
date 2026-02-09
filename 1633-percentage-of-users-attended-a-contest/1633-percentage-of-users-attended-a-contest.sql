# Write your MySQL query statement below
select Contest_id, ROUND(COUNT(r.user_id) * 100.0 / (SELECT COUNT(*) FROM Users), 2) AS percentage
from register R
Group by contest_id
order by percentage desc, R.contest_id ASC;