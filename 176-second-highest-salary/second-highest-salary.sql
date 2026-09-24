SELECT MAX(e1.salary) AS SecondHighestSalary
FROM Employee e1
LEFT JOIN Employee e2
    ON e1.salary < e2.salary
WHERE e2.salary IS NOT NULL;

##
##select (select  distinct salary  
##from Employee 
##order by salary desc 
##limit 1 offset 1 ) as SecondHighestSalary
  

  # when we use inner query result and it is nothing like 0 , the outer query gives as null