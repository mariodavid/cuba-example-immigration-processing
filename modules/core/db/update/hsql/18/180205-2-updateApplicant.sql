alter table CEIP_APPLICANT add column NAME varchar(255) ^
update CEIP_APPLICANT set NAME = '' where NAME is null ;
alter table CEIP_APPLICANT alter column NAME set not null ;
