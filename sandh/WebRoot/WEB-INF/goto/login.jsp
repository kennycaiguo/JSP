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
    
    <title>login</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
  </head>
  
  <body>
     <s:form action="list_login" namespace="/sandh">
       
         <legend>管理登录页面</legend>
        
           <table align="center" width="210px" border="1" cellspacing="1" cellpadding="1">
              <tr><s:textfield name="user.username" value="lium" /> </tr>
              <tr><s:password name="user.password" value="lium"/></tr>
              <tr><s:submit value="登陆" align="center"></s:submit></tr>
              <tr bgcolor="#FFD700" ><td colspan="2"><s:property value="#attr.loginerror"/></td></tr>
           </table>
           <s:a href="sandh/" >注册</s:a>
            <s:a href="sandh/list_login.action" >直接进入管理页</s:a>
           <hr/>
    </s:form> 
  </body>
</html>
