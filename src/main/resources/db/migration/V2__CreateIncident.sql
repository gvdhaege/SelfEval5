CREATE TABLE incident(
id INT PRIMARY KEY AUTO_INCREMENT,
NAME VARCHAR(100),
TYPE VARCHAR(100),
DISTANCE INT,
HIGHWAY_ID INT,
FOREIGN KEY (HIGHWAY_ID) REFERENCES HIGHWAY(HIGHWAY_ID)
)
;