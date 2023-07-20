--liquibase formatted sql

--changeset stever410:202307201034
--comment: Init account table

create table account
(
    id   UUID primary key,
    name varchar(255)
);

--rollback drop table account;