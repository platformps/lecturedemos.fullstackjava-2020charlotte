CREATE TABLE production_database.users(
    email VARCHAR(50) NOT NULL PRIMARY KEY,
    name TEXT NOT NULL,
    password TEXT NOT NULL,
    address TEXT,
    state TEXT,
    zip TEXT
);