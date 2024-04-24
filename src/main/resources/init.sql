CREATE SCHEMA IF NOT EXISTS test;
USE test;

DROP TABLE IF EXISTS marketing;
CREATE TABLE marketing(id BIGINT PRIMARY KEY AUTO_INCREMENT, name VARCHAR(80), budget VARCHAR(100));
INSERT INTO marketing(name, budget) VALUES('Advertising in the media', '80k som');
INSERT INTO marketing(name, budget) VALUES('Internet advertising', '20k som');
INSERT INTO marketing(name, budget) VALUES('Outdoor advertising', '30k som');
INSERT INTO marketing(name, budget) VALUES('PR events', '70k som');

DROP TABLE IF EXISTS marketingCategoryList;
CREATE TABLE marketingCategoryList(id BIGINT PRIMARY KEY AUTO_INCREMENT, name VARCHAR(80), subscribers VARCHAR(100));
INSERT INTO marketingCategoryList(name, subscribers) VALUES('Instagram', '100k');
INSERT INTO marketingCategoryList(name, subscribers) VALUES('Facebook', '45k');
INSERT INTO marketingCategoryList(name, subscribers) VALUES('Youtube', '20k');

DROP TABLE IF EXISTS coverageArea;
CREATE TABLE coverageArea(id BIGINT PRIMARY KEY AUTO_INCREMENT, region VARCHAR(80), percentage VARCHAR(100), clients VARCHAR(100));
INSERT INTO coverageArea(region, percentage, clients) VALUES('Bishkek', '35%', '700k');
INSERT INTO coverageArea(region, percentage, clients) VALUES('Talas', '15%', '300k');
INSERT INTO coverageArea(region, percentage, clients) VALUES('Jalal-Abad', '7%', '140k');
INSERT INTO coverageArea(region, percentage, clients) VALUES('Osh', '25%', '500k');
INSERT INTO coverageArea(region, percentage, clients) VALUES('Naryn', '5%', '100k');
INSERT INTO coverageArea(region, percentage, clients) VALUES('Issyk-Kul', '8%', '160k');
INSERT INTO coverageArea(region, percentage, clients) VALUES('Batken', '5%', '100k');

DROP TABLE IF EXISTS budgetCategory;
CREATE TABLE budgetCategory(id BIGINT PRIMARY KEY AUTO_INCREMENT, category VARCHAR(80), budget VARCHAR(100));
INSERT INTO budgetCategory(category, budget) VALUES('Marketing', 250000);
INSERT INTO budgetCategory(category, budget) VALUES('Salary', 200000);





