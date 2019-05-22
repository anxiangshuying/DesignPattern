<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">
<title>payer une reservation</title>

<title>payer</title>
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
	<form action="PayerServlet" method="post" onsubmit="return reg(this);">
		<table align="center" border="0" width="500">
		    <tr>
				<td align="right" width="30%">ID d'utilisateur：</td>
				<td><input type="text" name="idutili" class="box"></td>
			</tr>
			<tr>
				<td align="right" width="30%">Id de reservation：</td>
				<td><input type="text" name="idreser" class="box"></td>
			</tr>
			<tr>
				<td align="right" width="30%">numero carte：</td>
				<td><input type="text" name="numcarte" class="box"></td>
			</tr>
			<tr>
				<td align="right">code：</td>
				<td><input type="text" name="code" class="box"></td>
			</tr>

			<tr>
				<td colspan="2" align="center" height="40"><input type="submit"
					value="Payer"></td>
			</tr>
		</table>
	</form>
</body>
</html>
