# Write your MySQL query statement below
select unique_id , name
from employeeUNI as e right join employees as a
on e.id = a.id