<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>List</title>
    
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
    进入展示页面 <br>
    <tr>
       <td>序号</td>
       <td>用户名</td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
       <td>密码</td>
    </tr><br/>
    
    <s:iterator value="loginList" var="user">
       
    	<s:property value="#user.UId"/>&nbsp;&nbsp;&nbsp;&nbsp;
    	<s:property value="#user.UName"/>&nbsp;&nbsp;&nbsp;&nbsp;
    	<s:property value="#user.UPwd"/>&nbsp;&nbsp;&nbsp;&nbsp;<br/>
    	
    </s:iterator>
    <hr/>
    <a href="">用户信息添加</a>
  </body>
</html>
