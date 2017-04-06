<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'list.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    所有用户信息如下：<br/>
    <s:iterator value="userList" var="user">
    	<s:property value="#user.UId"/>&nbsp;&nbsp;&nbsp;&nbsp;
    	<s:property value="#user.UName"/>&nbsp;&nbsp;&nbsp;&nbsp;
    	<s:property value="#user.UPwd"/>&nbsp;&nbsp;&nbsp;&nbsp;
    	<a href="svse/User_detail.action?UId=${user.UId } ">详细</a>
    	<a href="svse/User_pre_update.action?UId=${user.UId } ">更新</a>
    	<a href="svse/User_del.action?UId=${user.UId } ">删除</a>
    	<br/>
    </s:iterator>
    <hr/>
    <a href="svse/User_pre_add.action">用户信息添加</a>
  </body>
</html>
