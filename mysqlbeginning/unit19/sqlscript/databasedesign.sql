create table book(
	book_id 	int auto_increment,
	name 		varchar(100) not null,
	sn 			varchar(100) unique not null,
	price 		decimal(5, 2) not null default 0,
	remark 		varchar(100),
	primary key(book_id)
);

show tables;

desc book;

create table book_order(
	order_id		varchar(50) not null,
	money			decimal(10, 2) not null,
	addr			varchar(100),
	phone			varchar(11),
	order_time		datetime not null,
	primary key		(order_id)
);

create table order_item(
	order_id		varchar(50) not null,
	book_id			int not null,
	num				int not null,
	primary key		(order_id, book_id),
	foreign key		(book_id) references book(book_id) on delete cascade on update cascade,
	foreign key		(order_id) references book_order(order_id) on delete cascade on update cascade
);

select * from book;