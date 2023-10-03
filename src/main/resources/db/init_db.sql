create table product
(
    id    serial not null,
    name  varchar(255),
    value JSONB,
    primary key (id)
);