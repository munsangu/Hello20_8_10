drop * by customer;
create table customer(
	code number(10) primary key,
	name varchar(30) not null,
	email varchar(30),
	tel varchar(35)
)

insert into customer values(
	1, '������', 'jeea@shop.com','02-137-1484');
insert into customer values(
	2, '�����', 'rose@shop.com','02-528-1132');
insert into customer values(
	3, '�����', 'lily@shop.com','02-177-1420');
	
select * from CUSTOMER;