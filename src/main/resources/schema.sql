CREATE TABLE members (
                         memberId serial PRIMARY KEY,
                         firstName varchar(80) NOT NULL,
                         lastName varchar(80) NOT NULL,
                         dateOfBirth DATE NOT NULL
);