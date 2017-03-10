<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html >
<head >
<base href="<%=basePath%>">

<title>My JSP 'index.jsp' starting page</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<style>
table {
border-collapse: collapse;/*为表格设置合并边框模型*/
}
table td {
border:1px solid #ff0000;
}

</style>
</head>

<body style="background-image: url('Tp/mm.jpg');">
<form action="<%=request.getContextPath() %>/servlet/UserLogin" method="post">
	<table align="center" width="200px" >
			<tr>
				<td colspan="2" align="center"><strong>管理员登陆</strong></td>
			</tr>
			<tr>
				<td width="60px">账号：</td>
				<td width="140px"><input type="text" name="username" size="15"/></td>
			</tr>
			<tr>
				<td width="60px">密码：</td>
				<td width="140px"><input type="password" name="password" size="15"/></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit" value="确定"/></td>
			</tr>
	</table>
	</form>
<embed src="Tp/ry.mp3" loop="2" autostart="true" hidden="true" type="audio/mpeg"/></embed>
</body>
</html>
