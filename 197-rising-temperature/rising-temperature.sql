select w.id from Weather w 
join Weather r
   on DateDiff(w.recordDate,r.recordDate) = 1
   where w.temperature>r.temperature
order by w.id 