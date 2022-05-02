    
    create table categories (
       category_id int4 not null,
        category_name varchar(255),
        primary key (category_id)
    );

    create table products (
       id  serial not null,
        date_product_was_added date,
        product_brand varchar(255),
        product_expiry_date date,
        product_name varchar(255),
        product_price int4,
        product_stock_quantity int4,
        serial_number_of_the_product varchar(255),
        category_id int4,
        primary key (id)
    );

    create table brands (
       id  serial not null,
        brand_name varchar(255),
        primary key (id)
    );

    alter table products 
       add constraint FKog2rp4qthbtt2lfyhfo32lsw9 
       foreign key (category_id) 
       references categories

