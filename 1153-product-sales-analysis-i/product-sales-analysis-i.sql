# Write your MySQL query statement below
select p.product_name ,  year,  price 
from sales as s
join product p 
on s.product_id = p.product_id