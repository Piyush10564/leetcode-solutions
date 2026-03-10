# Write your MySQL query statement below
SELECT id
FROM
(SELECT *,
LAG(temperature) OVER (ORDER BY recordDate) AS prev_temp,
LAG(recordDate) OVER (ORDER BY recordDate) AS prev_date
FROM Weather) As tamp
WHERE
temperature>prev_temp
AND DATEDIFF(recordDate, prev_date) = 1;