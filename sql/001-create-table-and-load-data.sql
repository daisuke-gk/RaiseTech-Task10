DROP TABLE IF EXISTS users;

CREATE TABLE users (
  id int unsigned AUTO_INCREMENT,
  name VARCHAR(100) NOT NULL,
  email VARCHAR(100) NOT NULL ,
  PRIMARY KEY(id)
);

INSERT INTO users (name, email) VALUES ('gake', 'gake@gmail.com');
INSERT INTO users (name, email) VALUES ('daisuke', 'daisuke@gmail.com');
