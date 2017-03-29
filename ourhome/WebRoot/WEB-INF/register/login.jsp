<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>home首页</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
  </head>
  
  <body>
    <s:form action="dologin" namespace="/home">
       
         <legend>管理登录页面</legend>
        
           <table align="center" width="210px" border="1" cellspacing="1" cellpadding="1">
              <tr><s:textfield name="user.username" label="账号"/> </tr>
              <tr><s:password name="user.password" label="密码"/></tr>
              <tr><s:submit value="登陆" align="center"></s:submit></tr>
           </table>
                                  <s:a href="home/" >注册</s:a>
    </s:form> 
  </body>
</html>
