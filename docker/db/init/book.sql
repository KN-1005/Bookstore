-- drop book table
DROP TABLE IF EXISTS BOOK;

-- create sample table
CREATE TABLE IF NOT EXISTS BOOK (
    id serial PRIMARY KEY,
    title text,
    description text
)
