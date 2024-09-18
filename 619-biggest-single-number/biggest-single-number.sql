# Write your MySQL query statement below
select ifnull(( select num as num
 from mynumbers
group by num
having  count(num) < 2
order by num desc
limit 1),null)as num