# Write your MySQL query statement below
-- SELECT * FROM Users
#where mail REGEXP '^[A-Za-z][A-Za-z0-9_\.\-]*@leetcode[.]com$'

-- regexp syntax 
-- start ^ , end $ , for - , . as compiler not get confuse we use \ with them , and all for --string tha here isliye '' * --> for joining sentence 

##ELECT *
##FROM Users
##WHERE mail REGEXP BINARY '^[A-Za-z][A-Za-z0-9_\\.\\-]*@leetcode\\.com$'

-- used binary for making it case senstive 


SELECT *
FROM Users
WHERE REGEXP_LIKE(mail, '^[A-Za-z][A-Za-z0-9_\\.\\-]*@leetcode\\.com$', 'c');