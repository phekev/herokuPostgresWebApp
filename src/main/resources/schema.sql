CREATE TABLE IF NOT Exists customers (
    CustID INT GENERATED ALWAYS AS IDENTITY ,
    Username varchar(20) NOT NULL,
    Password varchar(20) NOT NULL,
    F_Name varchar(20) DEFAULT NULL,
    L_Name varchar(20) DEFAULT NULL,
    Email varchar(40) NOT NULL UNIQUE ,
    Address1 TEXT DEFAULT NULL,
    Address2 TEXT DEFAULT NULL,
    Address3 TEXT DEFAULT NULL,
    County varchar(20) DEFAULT NULL,
    AccountCreated timestamptz DEFAULT now(),
    PRIMARY KEY (CustID)
    );

CREATE TABLE IF NOT EXISTS orders (
    OrderID INT GENERATED ALWAYS AS IDENTITY,
    CustID INTEGER REFERENCES customers (CustID) ON DELETE RESTRICT ,
    OrderDate varchar(10) DEFAULT NULL,
    PRIMARY KEY (OrderID)
    );

CREATE TABLE IF NOT EXISTS products (
    ProdID INT GENERATED ALWAYS AS IDENTITY ,
    Name TEXT DEFAULT NULL,
    Description TEXT DEFAULT NULL,
    Price MONEY DEFAULT 0.00,
    PRIMARY KEY (ProdID)
    );

CREATE TABLE IF NOT EXISTS orders_details (
    ID INT GENERATED ALWAYS AS IDENTITY,
    OrderID INTEGER REFERENCES orders (OrderID) ON DELETE CASCADE ,
    ProdID INTEGER REFERENCES products (ProdID) ON DELETE RESTRICT ,
    Price MONEY DEFAULT 0.00,
    Quantity INTEGER DEFAULT NULL,
    Total MONEY DEFAULT NULL,
    PRIMARY KEY (ID)
    );