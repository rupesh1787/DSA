select (select  distinct salary  
from Employee 
order by salary desc 
limit 1 offset 1 ) as SecondHighestSalary
  

  # when we use inner query result and it is nothing like 0 , the outer query gives as null