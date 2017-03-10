<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
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
	border-collapse: collapse; /*为表格设置合并边框模型*/
}

table td {
	border: 1px solid #ff0000;
}

/*使用jQuery的css方法也可*/
.bold {
	font-weight: bold;
}

td {
	text-align: center;
}
</style>
</head>

<body>

	<table align="center" width="800px">
		<tr>
			<td colspan="13" align="center"><strong>房屋出租管理信息</strong> <a
				href="<%=path %>/servlet/HouseEditUI">发布信息</a></td>
		</tr>
		<tr>
			<td class="bold">编号</td>
			<td class="bold">所在区域</td>
			<td class="bold">小区名称</td>
			<td class="bold">所在房型</td>
			<td class="bold">房屋面积(/m<sup>2</sup>)</td>
			<td class="bold">装修情况</td>
			<td class="bold">楼层</td>
			<td class="bold">租金(&yen;)</td>
			<td class="bold">房东</td>
			<td class="bold">房东电话</td>
			<td class="bold">出租情况</td>
			<td class="bold">发布人</td>
			<td class="bold">修改</td>
		</tr>
		<c:forEach items="${houseList}" var="list">
			<tr>
				<td>${list.hid }</td>
				<td>${list.harea }</td>
				<td>${list.hname }</td>
				<td>${list.hfx }</td>
				<td>${list.hmj }</td>
				<td>${list.hzx }</td>
				<td>${list.hlc }</td>
				<td>${list.hzj }</td>
				<td>${list.hfd }</td>
				<td>${list.hfdtel }</td>
				<c:choose>
					<c:when test="${list.hqk == '未出租' }">
						<td style="font-weight: bold; color:red">还未出租</td>
					</c:when>
					<c:otherwise>
						<td>${list.hqk }</td>
					</c:otherwise>
				</c:choose>
				<td>${userinfo.urealname }</td>
				<td><a
				href="<%=path %>/servlet/HouseEditUI?hid=${list.hid }">修改</a>
				</td>
			</tr>
		</c:forEach>
	</table>
	
</body>
</html>
