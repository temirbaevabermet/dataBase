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

DROP TABLE IF EXISTS workerList;
CREATE TABLE workerList(id BIGINT PRIMARY KEY AUTO_INCREMENT, name VARCHAR(80));
INSERT INTO workerList(name) VALUES('Makarov Egor');
INSERT INTO workerList(name) VALUES('Kuznetsova Irina');
INSERT INTO workerList(name) VALUES('Anton Shastun');

DROP TABLE IF EXISTS workList;
CREATE TABLE workList(id BIGINT PRIMARY KEY AUTO_INCREMENT, workName VARCHAR(80));
INSERT INTO workList(workName) VALUES(' Contact the hotel in Turkey');
INSERT INTO workList(workName) VALUES('Sell the latest travel packages(to Thailand) ');
INSERT INTO workList(workName) VALUES('Consult an important guest at 3pm');
INSERT INTO workList(workName) VALUES('Create an excursion programm for travelling in South Korea');


DROP TABLE IF EXISTS workersWorkList;
CREATE TABLE workersWorkList(id BIGINT PRIMARY KEY AUTO_INCREMENT, works VARCHAR(80));
INSERT INTO workersWorkList(works) VALUES('Print out a list of customer service areas');
INSERT INTO workersWorkList(works) VALUES('Translate the main speech for the consul from America ');
INSERT INTO workersWorkList(works) VALUES('Show the building to new employees');

DROP TABLE IF EXISTS clientsList;
CREATE TABLE clientsList(id BIGINT PRIMARY KEY AUTO_INCREMENT, name VARCHAR(80));
INSERT INTO clientsList(name) VALUES('Dylan Diaz');
INSERT INTO clientsList(name) VALUES('Junaid Broun');
INSERT INTO clientsList(name) VALUES('Trey Osborn');
INSERT INTO clientsList(name) VALUES('Julius Black');
INSERT INTO clientsList(name) VALUES('Amie Arias');

DROP TABLE IF EXISTS availableTrip;
CREATE TABLE availableTrip(id BIGINT PRIMARY KEY AUTO_INCREMENT, trip VARCHAR(80));
INSERT INTO availableTrip(trip) VALUES('South Korea');
INSERT INTO availableTrip(trip) VALUES('USA');
INSERT INTO availableTrip(trip) VALUES('Thailand');
INSERT INTO availableTrip(trip) VALUES('Italy');
INSERT INTO availableTrip(trip) VALUES('Germany');

DROP TABLE IF EXISTS soldTrip;
CREATE TABLE soldTrip(id BIGINT PRIMARY KEY AUTO_INCREMENT, trip VARCHAR(80));
INSERT INTO soldTrip(trip) VALUES('Turkey');
INSERT INTO soldTrip(trip) VALUES('Canada');
INSERT INTO soldTrip(trip) VALUES(' Malaysia');
INSERT INTO soldTrip(trip) VALUES('China');

DROP TABLE IF EXISTS toDoList;
CREATE TABLE toDoList(id BIGINT PRIMARY KEY AUTO_INCREMENT, works VARCHAR(80));
INSERT INTO toDoList(works) VALUES('Print out a list of customer service areas');
INSERT INTO toDoList(works) VALUES('Show the building to new employees');
INSERT INTO toDoList(works) VALUES('Translate the main speech for the consul from America');
INSERT INTO toDoList(works) VALUES('Print monthly report');

DROP TABLE IF EXISTS doneWork;
CREATE TABLE doneWork(id BIGINT PRIMARY KEY AUTO_INCREMENT, works VARCHAR(80));
INSERT INTO doneWork(works) VALUES('Print out a list of customer service areas');








