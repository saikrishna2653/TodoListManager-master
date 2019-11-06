--create table TODO (ID bigint not null, TASK_NAME varchar(255), TASK_DESC varchar(255),  STATUS varchar(255) , primary key (ID));

--create schema test;

--create table TODO (id bigint not null, STATUS varchar(255), TASK_DESC varchar(255), TASK_NAME varchar(255), primary key (id));

--create sequence hibernate_sequence start with 1 increment by 1;

INSERT INTO TODO VALUES(1, 'PENDING' ,  'Bath', 'Have a bath' );

INSERT INTO TODO VALUES(2, 'PENDING' ,  'Snacks', 'Have snacks' );

INSERT INTO TODO VALUES(3, 'PENDING' ,  'Office', 'Office' );

INSERT INTO TODO VALUES(4, 'PENDING' ,  'Lunch', 'Lunch' );



--------------MySQL
create table TODO (id bigint NOT NULL AUTO_INCREMENT, TASK_NAME varchar(255), TASK_DESC varchar(255),  STATUS varchar(255) , primary key (id));


INSERT INTO TODO VALUES(1,  'Bath', 'Have a bath' , 'PENDING' );

INSERT INTO TODO VALUES(2,   'Snacks', 'Have snacks' , 'PENDING'  );

INSERT INTO TODO VALUES(3,   'Office', 'Office' , 'PENDING' );

INSERT INTO TODO VALUES(4,   'Lunch', 'Lunch' , 'PENDING' );