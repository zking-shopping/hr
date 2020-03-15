<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
		<link rel="stylesheet" href="table.css" type="text/css" />
		<title>无标题文档</title>
		<style type="text/css">
<!--
.style3 {color: #0000CC}
-->
</style>
	</head>

	<body>
		<form method="post" action="salarystandard.do">
			<table width="100%">
				<tr>
					<td>
						<font color="#0000CC">您正在做的业务是：招聘管理--招聘考试题库管理--试题查询</font>
					</td>
				</tr>
				<tr>
					<td>
						&nbsp;
					</td>
				</tr>
				<tr>
					<td>
						符合条件的薪酬标准总数:
						${engageSubjectsFindList.size() }
						例
					</td>
				</tr>
			</table>
			<table width="100%" border="1" cellpadding=0 cellspacing=1
				bordercolorlight=#848284 bordercolordark=#eeeeee
				class="TABLE_STYLE1">
				<tr>
					<td width="20%" class="TD_STYLE1">
						<span>I级试题分类名称</span>
					</td>
					<td width="20%" class="TD_STYLE1">
						<span>II级试题分类名称</span>
					</td>
					<td width="15%" class="TD_STYLE1">
						<span>制定人</span>
					</td>
					<td width="30%" class="TD_STYLE1">
						<span>题目</span>
					</td>
					<td class="TD_STYLE1" width="15%">
						<span>登记时间</span>
					</td>
					<td width="30%" class="TD_STYLE1">
						<span>变更</span>
					</td>
					<td width="30%" class="TD_STYLE1">
						<span>删除</span>
					</td>
				</tr>
					<c:forEach var="list" items="${engageSubjectsList }">
						<tr class="TD_STYLE2">
							<td>
								${list.first_kind_name }
							</td>
							<td>
								${list.second_kind_name }
							</td>
							<td>
								${list.register }
							</td>
							<td>
								${list.content }
							</td>
							<td>
								${list.regist_time }
							</td>
							<td>
								<a href="/hr/engageSubjects/getBySubId?sub_id=${list.sub_id }">变更</a>
							</td>
							<td>
								<a href="/hr/engageSubjects/getBySubIdForDelete?sub_id=${list.sub_id }">删除</a>
							</td>
						</tr>
					</c:forEach>
				
			</table>
			<p>&nbsp;&nbsp;总数：1例 &nbsp;&nbsp;&nbsp;当前第 1 页  &nbsp;&nbsp;&nbsp;共 1 页  &nbsp;&nbsp;&nbsp;跳到第 <input name=page type=text class=input1 size=1> 页&nbsp;&nbsp;<input type=image src="images/go.bmp" width=18 height=18 border=0>
		</form>
	</body>
</html>