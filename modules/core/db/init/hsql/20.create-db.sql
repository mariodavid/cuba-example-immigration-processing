-- begin CEIP_MATTER
alter table CEIP_MATTER add constraint FK_CEIP_MATTER_CLIENT foreign key (CLIENT_ID) references CEIP_CLIENT(ID)^
create index IDX_CEIP_MATTER_CLIENT on CEIP_MATTER (CLIENT_ID)^
-- end CEIP_MATTER
-- begin CEIP_APPLICANT
alter table CEIP_APPLICANT add constraint FK_CEIP_APPLICANT_MATTER foreign key (MATTER_ID) references CEIP_MATTER(ID)^
create index IDX_CEIP_APPLICANT_MATTER on CEIP_APPLICANT (MATTER_ID)^
-- end CEIP_APPLICANT
-- begin CEIP_VISA
alter table CEIP_VISA add constraint FK_CEIP_VISA_APPLICANT foreign key (APPLICANT_ID) references CEIP_APPLICANT(ID)^
create index IDX_CEIP_VISA_APPLICANT on CEIP_VISA (APPLICANT_ID)^
-- end CEIP_VISA
-- begin CEIP_PASSPORT
alter table CEIP_PASSPORT add constraint FK_CEIP_PASSPORT_APPLICANT foreign key (APPLICANT_ID) references CEIP_APPLICANT(ID)^
create index IDX_CEIP_PASSPORT_APPLICANT on CEIP_PASSPORT (APPLICANT_ID)^
-- end CEIP_PASSPORT
-- begin CEIP_ADDRESS
alter table CEIP_ADDRESS add constraint FK_CEIP_ADDRESS_APPLICANT foreign key (APPLICANT_ID) references CEIP_APPLICANT(ID)^
create index IDX_CEIP_ADDRESS_APPLICANT on CEIP_ADDRESS (APPLICANT_ID)^
-- end CEIP_ADDRESS
-- begin CEIP_EMPLOYMENT
alter table CEIP_EMPLOYMENT add constraint FK_CEIP_EMPLOYMENT_APPLICANT foreign key (APPLICANT_ID) references CEIP_APPLICANT(ID)^
create index IDX_CEIP_EMPLOYMENT_APPLICANT on CEIP_EMPLOYMENT (APPLICANT_ID)^
-- end CEIP_EMPLOYMENT
-- begin CEIP_EDUCATION
alter table CEIP_EDUCATION add constraint FK_CEIP_EDUCATION_APPLICANT foreign key (APPLICANT_ID) references CEIP_APPLICANT(ID)^
create index IDX_CEIP_EDUCATION_APPLICANT on CEIP_EDUCATION (APPLICANT_ID)^
-- end CEIP_EDUCATION
