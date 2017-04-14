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
  <h1 align="center">三职个人详细信息查询平台</h1>
		<table border="1" align="center">
			<tr>
				<td>索引</td>
				<td>名字</td>
				<td>专业</td>
				<td>常住地</td>
			</tr>
			<s:iterator value="loginList" var="cv" status="s">
				<tr bgcolor="<s:if test="#s.even">pink</s:if>">
					<td><s:property value="#s.getCount()" />
					</td>
					<td><a href="sandh/detail.action?SId=${cv.SId }"><s:property value="#cv.SName"/></a>
					</td>
					<td><a href="sandh/detail.action?SClass='${cv.SClass}'"><s:property value="#cv.SClass"/></a>
					</td>
					<td><s:property value="#cv.SAddress"/>
					</td>
				</tr>
			</s:iterator>
		</table> 
		 <hr/>
    <a href="">用户信息添加</a>
  </body>
</html>
