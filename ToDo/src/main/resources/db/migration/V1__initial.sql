USE todo;
CREATE TABLE Task (
 id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
 title VARCHAR(100) NOT NULL,
 labelTitle VARCHAR(200),
 completed BOOLEAN,
 labelColor VARCHAR(20)
);
