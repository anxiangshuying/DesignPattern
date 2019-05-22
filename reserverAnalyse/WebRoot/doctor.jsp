<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML>
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>List of medecin</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<style type="text/css">
		input{
			border-radius: 7px;
			padding-left: 5px;
		}
		table{
			margin-top: 10px;
		}
	
	</style>

  </head>
  
  <body>
    <h1>Analyse</h1>
    <div style="color:red">click “chercher”pour aller page de date.jsp，entrer id 1 pour le test</div>
     <form action="MedecinServlet" method="post" style="border: 1px solid black; padding: 20px; border-radius: 9px; width: 70%; background-color: #00FFFF;">
    	<label>Nom de Medecin：</label>
    	<tr>
				<td><input type="text" name="nom" class="box"></td>
		</tr>
    	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    	<input type="submit" value="Chercher" style="height: 28px; width: 70px;">
    
    </form>
    
    <table  border="1" width="70%" cellspacing="0" cellpadding="0">
    	<tr style="background-color: orange">
    		<th>Nom de Medecin</th>
	         <th>Prenom de Medecin</th>
	         <th>Num de Sociale</th>
	          <th>date disponible</th>
    	</tr>
    	
    	<c:forEach items="${list}" var="list">
    	<tr style="background-color: orange">
    		<td>${list.nom}</td>
	        <td>${list.prenom}</td>
	        <td>${list.numSecuSoci}</td>
	        <td><input type = "button" value = "consulter" onclick = "window.location.href = 'date.jsp' "></td>
    	</tr>
    	</c:forEach>
    
    </table>
  </body>
</html>
