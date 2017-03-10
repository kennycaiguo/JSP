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
</style>
</head>

<body>
	<form action="/demo1/servlet/HouseSave" method="post">
		<table align="center" width="400px">
			<tr>
				<td colspan="2" align="center">
					<c:choose>
						<c:when test="${houseinfo.hid == null }">
							<strong>发布出租管理信息</strong>
						</c:when>
						<c:otherwise>
							<strong>修改出租管理信息</strong>
						</c:otherwise>
					</c:choose>
					<input name="hid" type="hidden" value="${houseinfo.hid }" />
				</td>
			</tr>
			<tr>
				<td width="100px">所在区域：</td>
				<td width="300px"><select name="harea" style="width:250px;">
					<option ${houseinfo.harea == '洪山区' ? 'selected="selected"' : '' }>洪山区</option>
					<option ${houseinfo.harea == '武昌区' ? 'selected="selected"' : '' }>武昌区</option>
				</select></td>
			</tr>
			<tr>
				<td width="100px">小区名称：</td>
				<td width="300px"><input name="hname"
					value="${houseinfo.hname }" style="width:250px;" /></td>
			</tr>
			<tr>
				<td width="100px">房型：</td>
				<td width="300px"><input name="hfx" value="${houseinfo.hfx }"
					style="width:250px;" /></td>
			</tr>
			<tr>
				<td width="100px">房屋面积(/m<sup>2</sup>)：</td>
				<td width="300px"><input name="hmj" value="${houseinfo.hmj }"
					style="width:250px;" /></td>
			</tr>
			<tr>
				<td width="100px">装修情况：</td>
				<td width="300px">
					<input type="radio" name="hzx" value="简装" ${houseinfo.hzx == '简装' ? 'checked="checked"' : '' }>简装
					<input type="radio" name="hzx" value="精装" ${houseinfo.hzx == '精装' ? 'checked="checked"' : '' }>精装
					<input type="radio" name="hzx" value="毛坯" ${houseinfo.hzx == '毛坯' ? 'checked="checked"' : '' }>毛坯
				</td>
			</tr>
			<tr>
				<td width="100px">楼层：</td>
				<td width="300px"><input name="hlc" value="${houseinfo.hlc }"
					style="width:250px;" /></td>
			</tr>
			<tr>
				<td width="100px">租金：</td>
				<td width="300px"><input name="hzj" value="${houseinfo.hzj }"
					style="width:250px;" /></td>
			</tr>
			<tr>
				<td width="100px">房东：</td>
				<td width="300px"><input name="hfd" value="${houseinfo.hfd }"
					style="width:250px;" /></td>
			</tr>
			<tr>
				<td width="100px">房东电话：</td>
				<td width="300px"><input name="hfdtel"
					value="${houseinfo.hfdtel }" style="width:250px;" /></td>
			</tr>
			<tr>
				<td width="100px">出租情况：</td>
				<td width="300px">
					<input type="radio" name="hqk" value="未出租" ${houseinfo.hqk == '未出租' ? 'checked="checked"' : '' }>未出租
					<input type="radio" name="hqk" value="已出租" ${houseinfo.hqk == '已出租' ? 'checked="checked"' : '' }>已出租
				</td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit" value="确定" />
				</td>
			</tr>
		</table>
	</form>
</body>
</html>
