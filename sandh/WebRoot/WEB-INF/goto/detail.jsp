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
    
    <title><s:property value="#cv.SName"/>的个人详细信息</title>
    
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
 <h1 align="center">个人信息详情页</h1>
  <table border="2" bgcolor=#40E0D0 align="center">
			<tr>
				<td>编号</td>
				<td><s:property value="#cv.SId"/>
				</td>
			</tr>
			<tr >
				<td>名字</td>
				<td><a href="<s:property value="#cv.SUrl"/>"><s:property value="#cv.SName"/></a>
				</td>
			</tr>
			<tr >
				<td>寝室</td>
				<td><s:property value="#cv.SDormitory"/>
				</td>
			</tr>
			<tr >
				<td>专业</td>
				<td><s:property value="#cv.SClass"/>
				</td>
			</tr>
			<tr >
				<td>生源地</td>
				<td><s:property value="#cv.SCounty"/>
				</td>
			</tr>
			<tr >
				<td>民族</td>
				<td><s:property value="#cv.SNationality"/>
				</td>
			</tr>
			<tr >
				<td>家庭住址</td>
				<td><s:property value="#cv.SAddress"/>
				</td>
			</tr>
			<tr >
				<td>楼栋</td>
				<td><s:property value="#cv.new_"/>
				</td>
			</tr>
			<td colspan="2" align="center">  
            共<s:property value="pageBean.allRow"/> 条记录  
            共<s:property value="pageBean.totalPage"/> 页   
            当前第<s:property value="pageBean.currentPage"/>页  
            <s:if test="%{pageBean.currentPage == 1}">  
            <input type="button" value="第一页" disabled="disabled" />  
            <input type="button" value="上一页" disabled="disabled" />  
            </s:if>  
            <s:else>  
            <input type="button" value="第一页" onclick="pageNo('1')"/>  
            <input type="button" value="上一页" onclick="pageNo('<s:property value="%{pageBean.currentPage-1}"/>')"/>  
            </s:else>  
            <s:if test="%{pageBean.currentPage != pageBean.totalPage}">  
            <input type="button" value="下一页" onclick="pageNo('<s:property value="%{pageBean.currentPage+1}"/>')"/>  
            <input type="button" value="最后一页" onclick="pageNo('<s:property value="%{pageBean.totalPage}"/>')"/>  
            </s:if>  
            <s:else>  
            <input type="button" value="下一页" disabled="disabled" />  
            <input type="button" value="最后一页" disabled="disabled" />  
            </s:else>  
            跳转到：  
            <select id="gotoNo" name="gotoNo" onchange="onTiao()">  
                <s:iterator value="#session.numberList">  
                    <s:if test="pageBean.currentPage eq pageNumber">  
                    <option value="<s:property value="pageNumber"/>" selected="selected" ><s:property value="pageNumber"/></option>  
                    </s:if>  
                    <s:else>  
                    <option value="<s:property value="pageNumber"/>"><s:property value="pageNumber"/></option>  
                    </s:else>  
                </s:iterator>  
            </select>  
            页  
        </td>  
  
		</table>
  
  </body>
</html>
