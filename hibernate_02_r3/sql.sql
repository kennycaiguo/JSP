--��system�û���ݵ�¼

--�����û�
create user htest
identified by htest;
--��Ȩ
grant dba to htest;

--�л��û�

--��������
create sequence HIBERNATE_SEQUENCE
minvalue 1
maxvalue 1000
start with 1
increment by 1
cache 20;

--������
create table T_USER
(
  u_id   NUMBER(10) PRIMARY KEY,
  u_name VARCHAR2(20),
  u_pwd  VARCHAR2(20)
)
