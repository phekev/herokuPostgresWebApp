CREATE TABLE IF NOT Exists customers (
    custID INT GENERATED ALWAYS AS IDENTITY ,
    first_name varchar(20) DEFAULT NULL,
    last_name varchar(20) DEFAULT NULL,
    email varchar(40) NOT NULL UNIQUE ,
    accountCreated timestamptz DEFAULT now(),
    PRIMARY KEY (custID)
    );

CREATE TABLE IF NOT EXISTS orders (
    orderID INT GENERATED ALWAYS AS IDENTITY,
    custID INTEGER REFERENCES customers (custID) ON DELETE RESTRICT ,
    order_date varchar(10) DEFAULT NULL,
    PRIMARY KEY (orderID)
    );

CREATE TABLE IF NOT EXISTS products (
    prodID INT GENERATED ALWAYS AS IDENTITY ,
    name TEXT DEFAULT NULL,
    description TEXT DEFAULT NULL,
    price MONEY DEFAULT 0.00,
    PRIMARY KEY (prodID)
    );

CREATE TABLE IF NOT EXISTS orders_details (
    id INT GENERATED ALWAYS AS IDENTITY,
    orderID INTEGER REFERENCES orders (orderID) ON DELETE CASCADE ,
    prodID INTEGER REFERENCES products (prodID) ON DELETE RESTRICT ,
    price MONEY DEFAULT 0.00,
    quantity INTEGER DEFAULT NULL,
    total MONEY DEFAULT NULL,
    PRIMARY KEY (ID)
    );