DROP table IF EXISTS LOGINER;
CREATE TABLE LOGINER (
	id DECIMAL PRIMARY KEY,
	name VARCHAR(30) NOT NULL,
	cryptography VARCHAR(32) NOT NULL
)ENGINE=InnoDB DEFAULT CHARSET=utf8;