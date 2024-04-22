CREATE SCHEMA IF NOT EXISTS test;
USE test;

DROP TABLE IF EXISTS marketing;
CREATE TABLE marketing(id BIGINT PRIMARY KEY AUTO_INCREMENT, name VARCHAR(80), budget VARCHAR(100));
INSERT INTO marketing(name, budget) VALUES('Advertising in the media', '80k som');
INSERT INTO marketing(name, budget) VALUES('Internet advertising', '20k som');
INSERT INTO marketing(name, budget) VALUES('Outdoor advertising', '30k som');
INSERT INTO marketing(name, budget) VALUES('PR events', '70k som');
