# Write your MySQL query statement below
select  e.name as employee
from Employee e
inner join Employee e2
on e.managerId = e2.id
 where e.salary>e2.salary
