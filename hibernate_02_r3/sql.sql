--以system用户身份登录

--创建用户
create user htest
identified by htest;
--授权
grant dba to htest;

--切换用户

--创建序列
create sequence HIBERNATE_SEQUENCE
minvalue 1
maxvalue 1000
start with 1
increment by 1
cache 20;

--创建表
create table T_USER
(
  u_id   NUMBER(10) PRIMARY KEY,
  u_name VARCHAR2(20),
  u_pwd  VARCHAR2(20)
)
