--liquibase formatted sql

--changeset stever410:202307201034
--comment: Init app_user table

create table app_user
(
    id         UUID primary key,
    name       varchar(255) not null,
    email      varchar(255) not null,
    phone_num  varchar(20),
    auth0_id   varchar(50)  not null,
    created_at timestamp    not null default current_timestamp,
    updated_at timestamp,
    removed_at timestamp
);

--rollback drop table app_user;