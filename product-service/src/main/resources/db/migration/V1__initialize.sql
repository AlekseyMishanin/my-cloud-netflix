DROP TABLE IF EXISTS products;
CREATE TABLE products (
    id bigserial,
    title varchar(255),
    price int,
    PRIMARY KEY (id)
);
INSERT INTO products (title, price) VALUES
('Cheese', 320),
('Milk', 90),
('Apples', 120),
('Hammer', 200);

