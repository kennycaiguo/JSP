<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>login page</title>
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
      <form action="login.action">
      <fieldset>
      <legend>登录页面</legend>
      <table align="center" width="280px" border="1" cellspacing="1" cellpadding="1">
            <tr>
              <td>账号：</td>
              <td><input type="text" name="user.username"/></td>
            </tr>
            <tr>
              <td>密码：</td>
              <td><input type="password" name="user.password"/></td>
            </tr>
            <tr >
             <td colspan="2" align="center"><input type="submit" value="登录"/></td>
            </tr>
            <tr>
            <td colspan="2" align="center"><input type="reset" value="重填"/></td> 
            </tr>
        </table>
      </fieldset>
        
   </form>
  </body>
</html>
