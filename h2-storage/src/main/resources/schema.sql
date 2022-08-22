create table assembly_order
(
    id integer not null,
    goods_id varchar(255),
    quantity integer,
    status varchar(255),
    assembler varchar(255),
    primary key(id)
);