<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>register</title>
</head>
<body>

    <h1  align="center">Register</h1>
	<form action="UtilisateurServlet" method="post">
	<table align="center" border="0" width="500" style="background:#00FFFF">
			<tr>
				<td align="right" width="30%">nom:</td>
				<td><input type="text" name="nom" class="box"></td>
			</tr>
			<tr>
				<td align="right">prenom:</td>
				<td><input type="text" name="prenom" class="box"></td>
			</tr>
<tr>
				<td align="right">number social：</td>
				<td><input type="text" name="numSecuSoci" class="box"></td>
			</tr>
			<tr>
				<td colspan="2" align="center" height="40"><input type="submit"
					value="register"></td>
			</tr>
		</table>

	</form>
	

</body>
</html>