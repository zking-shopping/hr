<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<html>
	<head>
		
		
		
		
		<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
		<link rel="stylesheet" href="<%=basePath%>jsp/table.css" type="text/css">
		<script src="<%=basePath%>jsp/javascript/cy/jquery-1.8.3.min.js"></script>
		<script type="text/javascript" src="<%=basePath%>jsp/javascript/cy/delete_locate.js">
		
function toCheck(id)
{
	document.forms[0].action = document.forms[0].action + "?operate=toCheck&id=" + id;
	document.forms[0].submit();
}
</script>
	</head>

	<body>
		<form id="delete_human" name="humanfileForm" method="post" >
			<table width="100%">
				<tr>
					<td>
						<font color="#0000CC">您正在做的业务是：人力资源--人力资源档案管理--人力资源档案删除 </font>
					</td>
				</tr>
				<tr>
					<td>
						人力资源档案总数：
						1
						例
					</td>
				</tr>
			</table>
			<table width="100%" border="1" cellpadding=0 cellspacing=1
				bordercolorlight=#848284 bordercolordark=#eeeeee
				class="TABLE_STYLE1">
				
				<tr class="TR_STYLE1">
					<td width="13%" class="TD_STYLE1">
						档案编号
					</td>
					<td width="13%" class="TD_STYLE1">
						姓名
					</td>
					<td width="11%" class="TD_STYLE1">
						性别
					</td>
					<td width="14%" class="TD_STYLE1">
						I级机构
					</td>
					<td width="14%" class="TD_STYLE1">
						II级机构
					</td>
					<td width="14%" class="TD_STYLE1">
						III级机构
					</td>
					<td width="14%" class="TD_STYLE1">
						职称
					</td>
					<td width="7%" class="TD_STYLE1">
						删除
					</td>
				</tr>
				<c:forEach items="${requestScope.humans}" var="human">
					<tr>
						<td class="TD_STYLE2">
							${human.huf_id }
						</td>
						<td class="TD_STYLE2">
							${human.human_name }
						</td>
						<td class="TD_STYLE2">
						男
						</td>
						<td class="TD_STYLE2">
							${human.first_kind_name}
						</td>
						<td class="TD_STYLE2">
							${human.second_kind_name }
						</td>
						<td class="TD_STYLE2">
							${human.third_kind_name }
						</td>
						<td class="TD_STYLE2">
							${human.human_major_kind_name }
						</td>
						<td class="TD_STYLE2">
						    <input type="button" value="删除" class="BUTTON_STYLE1" onclick="deleteHuman(this)">
						</td>
					</tr>
				   </c:forEach>
			</table>
			<p>&nbsp;&nbsp;总数：1例 &nbsp;&nbsp;&nbsp;当前第 1 页  &nbsp;&nbsp;&nbsp;共 1 页  &nbsp;&nbsp;&nbsp;跳到第 <input name=page type=text class=input1 size=1> 页&nbsp;&nbsp;<input type=image src="images/go.bmp" width=18 height=18 border=0>
		</form>
	</body>
</html>
