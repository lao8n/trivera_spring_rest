DROP TABLE RESERVATIONS;
DROP SEQUENCE HIBERNATE_SEQUENCE RESTRICT;

CREATE SEQUENCE HIBERNATE_SEQUENCE START WITH 1 INCREMENT BY 1;
CREATE TABLE RESERVATIONS (ID INTEGER PRIMARY KEY, 
                           ARRIVALDATE DATE, 
                           NAME VARCHAR(255), 
                           NIGHTS INTEGER NOT NULL,  
                           STATUS VARCHAR(10));
