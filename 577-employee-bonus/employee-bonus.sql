# Write your MySQL query statement below
select e.name , e2.bonus 
from Employee e
left join Bonus e2
on e.empId = e2.empId
where bonus<1000 or bonus is null;