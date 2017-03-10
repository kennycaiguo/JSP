create database mydb
go

use mydb
create table userinfo
(
uid int primary key,
uame varchar(50) not null,
upsw varchar(20) not null,
urealname varchar(50) not null
)

create table houseinfo
(
hid int identity(1,1) primary key,
uid int,
harea varchar(50) not null,
hname varchar(100) not null,
hfx varchar(50) not null,
hmj varchar(50) not null,
hzx varchar(50) not null,
hlc varchar(20) not null,
hzj varchar(20) not null,
hfd varchar(20) not null,
hfdtel varchar(50) not null,
hqk varchar(50) not null
)

alter table houseinfo
add constraint fk_uid foreign key(uid) references userinfo(uid)

insert into userinfo values(1,'lium','lium','刘明')
insert into userinfo values(2,'liul','liul','刘丽')
insert into userinfo values(3,'liuh','liuh','刘华')

insert into houseinfo(uid,harea,hname,hfx,hmj,hzx,hlc,hzj,hfd,hfdtel,hqk) values(1,'武昌区','2','3','4','简装','6','7','8','9','未出租')
insert into houseinfo(uid,harea,hname,hfx,hmj,hzx,hlc,hzj,hfd,hfdtel,hqk) values(1,'洪山区','2','3','4','精装','6','7','8','9','未出租')
insert into houseinfo(uid,harea,hname,hfx,hmj,hzx,hlc,hzj,hfd,hfdtel,hqk) values(1,'武昌区','2','3','4','毛坯','6','7','8','9','已出租')