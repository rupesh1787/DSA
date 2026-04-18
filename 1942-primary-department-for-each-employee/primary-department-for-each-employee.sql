SELECT 
    employee_id,
    CASE 
        WHEN MAX(primary_flag = 'Y') = 1 
        THEN MAX(CASE WHEN primary_flag = 'Y' THEN department_id END)
        ELSE MIN(department_id)
    END AS department_id
FROM Employee
GROUP BY employee_id;