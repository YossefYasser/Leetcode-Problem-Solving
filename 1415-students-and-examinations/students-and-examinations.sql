# Write your MySQL query statement below
select s.student_id, s.student_name,su.subject_name,count(e.student_id)  AS attended_exams
from Students s
 cross join subjects su
 LEFT JOIN Examinations e
ON s.student_id = e.student_id AND su.subject_name = e.subject_name
group by( s.student_id) , s.student_name,su.subject_name
order by (s.student_id) ,(su.subject_name)
