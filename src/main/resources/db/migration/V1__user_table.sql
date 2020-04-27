CREATE TABLE user
(
    id INT NOT NULL AUTO_INCREMENT,
    email VARCHAR(200) NULL,
    password VARCHAR(250) NULL,
    name VARCHAR(50) NULL,
    last_name VARCHAR(50) NULL,
    PRIMARY KEY (id)
);