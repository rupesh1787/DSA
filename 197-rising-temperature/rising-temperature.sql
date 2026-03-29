# Write your MySQL query statement below
# COMPARE --> SQL MAI AISE NORMALLY COMPARE NHI KR SKTE SO WHAT WE DO IS SELF JOIN THAT TABLE 
# AND THEN COMAPRE 

select w.id
from weather w , weather w2
where datediff(w.recordDate , w2.recordDate) = 1
and w.temperature > w2.temperature 

