# Write your MySQL query statement b
select t.employee_id as employee_id ,t.name as name,count(td.reports_to) as reports_count , round(avg(td.age)) as average_age
from Employees as t
join Employees as td
on t.employee_id = td.reports_to
group by t.employee_id
having count(td.reports_to) >=1
order by t.employee_id asc;