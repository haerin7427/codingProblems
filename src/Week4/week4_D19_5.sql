-- https://leetcode.com/problems/rising-temperature/
-- time: 10m
-- Create by haerin on 2021/08/26

SELECT id1.Id
FROM Weather AS id1, Weather AS id2
WHERE  id1.Temperature>id2.Temperature AND DATEDIFF(id1.recordDate , id2.recordDate )=1 ;