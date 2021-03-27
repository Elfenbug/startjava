CREATE DATABASE Jaegers;

CREATE TABLE Jaegers (
	id		SERIAL PRIMARY KEY,
	modelName	TEXT,
	mark		TEXT,
	height		DOUBLE PRECISION,
	weight		DOUBLE PRECISION,
	status		TEXT,
	origin		TEXT,
	launch		DATE,
	kaijuKill	INTEGER
);
