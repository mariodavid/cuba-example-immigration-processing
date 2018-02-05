-- begin CEIP_CLIENT
create table CEIP_CLIENT (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    --
    primary key (ID)
)^
-- end CEIP_CLIENT
-- begin CEIP_MATTER
create table CEIP_MATTER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    CLIENT_ID varchar(36) not null,
    NAME varchar(255),
    --
    primary key (ID)
)^
-- end CEIP_MATTER
-- begin CEIP_APPLICANT
create table CEIP_APPLICANT (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    MATTER_ID varchar(36) not null,
    NAME varchar(255) not null,
    --
    primary key (ID)
)^
-- end CEIP_APPLICANT
-- begin CEIP_VISA
create table CEIP_VISA (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    VALID_FROM date,
    VALID_UNTIL date,
    APPLICANT_ID varchar(36) not null,
    --
    primary key (ID)
)^
-- end CEIP_VISA
-- begin CEIP_PASSPORT
create table CEIP_PASSPORT (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    PASSPORT_ID varchar(255) not null,
    HOLDER varchar(255),
    APPLICANT_ID varchar(36) not null,
    --
    primary key (ID)
)^
-- end CEIP_PASSPORT
-- begin CEIP_ADDRESS
create table CEIP_ADDRESS (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    STREET varchar(255),
    POST_CODE varchar(255),
    CITY varchar(255),
    APPLICANT_ID varchar(36) not null,
    --
    primary key (ID)
)^
-- end CEIP_ADDRESS
-- begin CEIP_EMPLOYMENT
create table CEIP_EMPLOYMENT (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    EMPLOYER varchar(255),
    EMPLOYED_FROM date,
    EMPLOYED_UNTIL date,
    APPLICANT_ID varchar(36) not null,
    --
    primary key (ID)
)^
-- end CEIP_EMPLOYMENT
-- begin CEIP_EDUCATION
create table CEIP_EDUCATION (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    SCHOOL varchar(255),
    GRADUATION varchar(255),
    APPLICANT_ID varchar(36) not null,
    --
    primary key (ID)
)^
-- end CEIP_EDUCATION
