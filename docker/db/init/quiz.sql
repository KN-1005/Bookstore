-- drop sample table
DROP TABLE IF EXISTS SAMPLE;

-- create sample table
CREATE TABLE IF NOT EXISTS SAMPLE (
    id serial PRIMARY KEY,
    title text,
    description text
)
