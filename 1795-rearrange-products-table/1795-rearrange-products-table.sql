# Write your MySQL query statement below
-- approach 1
-- Select product_id, 'store1' as store, store1 as price
-- from products
-- where store1 is not null
-- union
-- Select product_id, 'store2' as store, store2 as price
-- from products
-- where store2 is not null
-- union
-- Select product_id, 'store3' as store, store3 as price
-- from products
-- where store3 is not null

-- approach 2
SELECT product_id, 'store1' AS store, store1 AS price FROM Products WHERE store1 IS NOT NULL
UNION 
SELECT product_id, 'store2' AS store, store2 AS price FROM Products WHERE store2 IS NOT NULL
UNION 
SELECT product_id, 'store3' AS store, store3 AS price FROM Products WHERE store3 IS NOT NULL

ORDER BY 1,2 ASC