<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML>
<html>
<head>
<base href="<%=basePath%>">

<title>reserver</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<style type="text/css">
input {
	border-radius: 7px;
	padding-left: 5px;
}

table {
	margin-top: 10px;
}
</style>

</head>

<body>
	<h1  align="center">Reserver</h1>

	<form action="Reservation1Servlet" method="post"
		onsubmit="return reg(this);">
		<table align="center" border="0" width="500" style="background:#00FFFF">
			<tr>
				<td align="right" width="30%">Type d'Analyse：</td>
				<td><input type="text" name="idtype" class="box"></td>
			</tr>
			<div style="color: red">par exemple : iput type 1(corresponder hemogramme)</div>
			<br />
			<tr>
				<td align="right" width="30%">Id d'Utilisateur：</td>
				<td><input type="text" name="iduser" class="box"></td>
			</tr>
			<tr>
				<td colspan="2" align="center" height="40"><input type="submit"
					value="Reserver"></td>
			</tr>
		</table>
	</form>
</body>
</html>
