SELECT * FROM Jaegers;

SELECT * FROM Jaegers WHERE status = 'Not Destroyed';

SELECT * from Jaegers WHERE mark IN('Mark-1', 'Mark-5');

SELECT * FROM Jaegers ORDER BY mark DESC;

SELECT * FROM Jaegers WHERE launch = (SELECT MIN(launch) FROM Jaegers);

SELECT * FROM Jaegers WHERE kaijukill = (SELECT MAX(kaijukill) FROM Jaegers);

SELECT AVG(weight) FROM Jaegers;

UPDATE Jaegers set kaijukill = kaijukill + 1 WHERE status = 'Not Destroyed';

DELETE FROM Jaegers WHERE status = 'Destroyed';

