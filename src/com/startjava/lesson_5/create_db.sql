CREATE DATABASE jaegers;
\c jaegers;

CREATE TABLE Jaeger (
    id SERIAL  PRIMARY KEY, 
    modelName  TEXT, 
    mark       CHAR(6), 
    height     DOUBLE PRECISION, 
    weight     DOUBLE PRECISION, 
    status     TEXT, 
    origin     TEXT, 
    launch     INTEGER, 
    kaijuKill  INTEGER
);