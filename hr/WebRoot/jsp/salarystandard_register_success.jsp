<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">



















































































	 





































<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<link rel="stylesheet" href="<%=basePath%>jsp/table.css" type="text/css">
<script type="text/javascript" src="<%=basePath%>jsp/javascript/comm/comm.js"></script>
</head>
<body>
<form method="post" action="">
<table width="100%" >
  <tr>
    <td colspan="2"> 
    <font color="#0000CC">您正在做的业务是：人力资源--薪酬标准管理--薪酬标准登记 </font></td>
  </tr>
  <tr>
    <td width="49%"> 提交成功，需要复核！</td>
    <td width="51%" align="right">
    <input type="button" value="返回" class="BUTTON_STYLE1" onclick="javascript:toAdd();"></td></tr>
  </table>

</form>
</body>
</html>



