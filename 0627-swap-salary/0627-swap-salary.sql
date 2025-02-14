# Write your MySQL query statement below
update salary
SET
    sex = CASE sex
        when 'm' then 'f'
        else 'm'
    END;