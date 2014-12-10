use master
go
create  database elevator
go
use elevator
go

go
create table account
(
	account_id int identity primary key,
	roles_id int,
	account_username nvarchar(50),
	account_password nvarchar(50),
	account_firstname nvarchar(50),
	account_lastname nvarchar(50),
	account_company nvarchar(50),
	account_address1 nvarchar(100),
	account_address2 nvarchar(100),
	account_city nvarchar(50),
	account_states nvarchar(50),
	account_zipcode nvarchar(50),
	account_country nvarchar(50),
	account_email varchar(100),
	account_phone varchar(30),
	account_status bit 
)
go
create table category
(
	category_id int identity primary key,
	category_name nvarchar(100),
	category_description nvarchar(max),
	category_image varchar(200),
	category_parent int NULL foreign key references category(category_id)
)
go
create table product
(
	product_id int identity primary key,
	category_id int foreign key references category(category_id),
	product_name nvarchar(100),
	product_price float,
	product_quantity int,
	product_discount float,
	product_description ntext,
	product_image varchar(200),
	product_createdate datetime,
	product_status bit
)
go

create table feedbacks
(
	feedback_id int identity primary key,
	feedback_fullname nvarchar(100),
	feedback_email varchar(100),
	feedback_description nvarchar(max),
	feedback_status bit,
	feedback_date datetime
)
go
create table news
(
	new_id int identity primary key,
	new_type int,
	new_title nvarchar(200),
	new_conten nvarchar(max),
	new_status bit,
	new_date datetime
)
go
create table orders
(
	order_id int identity primary key,
	account_id int foreign key references account(account_id),
	location_address nvarchar(100),
	location_city nvarchar(50),
	location_states nvarchar(50),
	location_zipcode nvarchar(50),
	location_country nvarchar(50),
	location_phone varchar(30),
	location_email varchar(30),
	enqury nvarchar(max),
	order_status varchar(50),
	order_payment varchar(100),
	order_date_construction datetime,
	order_date datetime
)
go
create table orders_details
(
	order_id int foreign key references orders(order_id),
	product_id int foreign key references product(product_id),
	order_detail_quantity int,
	order_detail_discount_product float,
	order_detail_price float,
	primary key (order_id, product_id)
)
go
create table complaints
(
	complaints_id int identity primary key,
	order_id int foreign key references orders(order_id),
	complaints_title nvarchar(200),
	complaints_description nvarchar(max),
	complaints_status bit,
	complaints_date datetime
)
go
create table contact_us
(
	contact_id int identity primary key,
	contact_website_office nvarchar(100),
	contact_website_address nvarchar(200),
	contact_website_phone varchar(100),
	contact_website_fax varchar(100),
	contact_website_email varchar(100),
	contact_title nvarchar(200),
	contact_fullname nvarchar(100),
	contact_email varchar(100),
	contact_conten nvarchar(max),
	contact_date datetime
)
