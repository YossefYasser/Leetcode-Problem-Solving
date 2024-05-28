select v.customer_id, count(v.customer_id) as count_no_trans
FROM Visits as v
left JOIN Transactions as t
on v.visit_id = t.visit_id
where t.transaction_id is null
group by v.customer_id