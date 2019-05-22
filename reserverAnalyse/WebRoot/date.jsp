<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>Date</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
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
	<h2  align="center">Date</h2>
	click “chercher”pour aller page de date.jsp，entrer id 1 pour le test 
	<form action="DateServlet" method="post"
		style="border: 1px solid black; padding: 20px; border-radius: 9px; width: 70%; background-color: #00FFFF;">
		
			Entrer Id de Medecin:
			<input type="text" name="id_Medecin">
			<input type="submit" value="Chercher" style="height: 28px; width: 70px;">
	</form>

	<table border="1" width="70%" cellspacing="0" cellpadding="0">
		<tr style="background-color: orange">
			<th>date</th>
			<th>state</th>
			<th>reservation</th>
		</tr>

<!--var="每个变量名字"   items="要迭代的list"   varStatus="每个对象的状态"   begin="循环从哪儿开始"    end="循环到哪儿结束"    step="循环的步长 -->
		<c:forEach items="${dateDocList}" var="dateDoc">
			<tr style="background-color: orange">
				<td>${dateDoc.date}</td>
				<td>
				<c:choose>
				<c:when test = "${dateDoc.state == 0}">Disponible</c:when>
				<c:when test = "${dateDoc.state == 1}">En attente de confirmation</c:when>
				<c:otherwise>Occuper</c:otherwise>
				</c:choose>
				</td>
				<td>
				<c:choose>
				<c:when test = "${dateDoc.state == 0}">
					<input type = "button" value = "reserver" onclick = "window.location.href = 'reservation.jsp' ">
				</c:when>
				<c:when test = "${dateDoc.state == 1}">Non disponible</c:when>
				<c:otherwise>Occuper</c:otherwise>
				</c:choose>
				</td>
			</tr>
		</c:forEach>

	</table>
</body>
</body>
</html>
