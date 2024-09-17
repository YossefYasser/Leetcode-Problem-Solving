# Write your MySQL query statement below

-- هشوف بيعنا قد ايه و اشوف هي ف اليوم اللي اتباعت فيه كانت بكام

select p.product_id  , ifnull(round(sum(u.units * p.price)/sum(u.units),2),0) as average_price
from prices p left join unitsSold u 
on p.product_id = u.product_id and u.purchase_date  between  p.start_date and p.end_date
group by product_id 
