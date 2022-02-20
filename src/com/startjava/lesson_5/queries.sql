/* вывести всю таблицу */
SELECT * FROM Jaeger;

/* отобразить только не уничтоженных роботов */
SELECT * FROM Jaeger WHERE status <> 'Destroyed';

/* отобразить роботов нескольких серий, например Mark-1 и Mark-6 */
SELECT * FROM Jaeger WHERE mark = 'Mark-1' OR mark = 'Mark-6';

/* отсортировать таблицу по убыванию по столбцу mark */
SELECT * FROM Jaeger ORDER BY mark;

/* отобразить самого старого робота */
SELECT * FROM Jaeger WHERE launch = (SELECT MIN(launch) FROM Jaeger);

/* отобразите роботов, которые уничтожили больше/меньше всех kaiju */
SELECT modelName, kaijuKill FROM Jaeger WHERE kaijuKill = (SELECT MIN(kaijuKill) FROM Jaeger);
SELECT modelName, kaijuKill FROM Jaeger WHERE kaijuKill = (SELECT MAX(kaijuKill) FROM Jaeger);

/* отобразить средний вес роботов */
SELECT ROUND(CAST(AVG(weight) AS NUMERIC),3) AS AverageWeight FROM Jaeger;

/* увеличьть на единицу количество уничтоженных kaiju у роботов, которые до сих пор не разрушены */
UPDATE jaeger SET kaijuKill = kaijuKill + 1 WHERE status <> 'Destroyed';

/* удалить уничтоженных роботов */
DELETE FROM jaeger WHERE status = 'Destroyed';


