# Write your MySQL query statese
select E.name,B.bonus
from Employee E 
 left join  Bonus B 
on E.EmpId = B.empId where (b.bonus <1000 or bonus is null)