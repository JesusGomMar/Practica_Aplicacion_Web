<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registro Equipo</title>
</head>
<body>
<!--  
<c:if test="${sessionScope.identificado == null }">
	<jsp:forward page="login.jsp"></jsp:forward>
</c:if>
<div style="color: red">${mensaje}</div>
-->
<a href = "index.jsp">volver a inicio</a><br/>

Introduce los datos de tu Equipo:<br/>
<form action="ServletRegistroEquiposAdmin" method="post" >

	Nombre Jugador: <input type="text" name="campoNombre_jugador"/><br/>
	Nombre Equipo: <input type="text" name="campoNombre_equipo"/><br/>
	Fecha:  <input type="date" name="campoFecha"/><br/>
	Legendarios: <input type="text" name="campoLegendarios"/><br/>
	Pokemon 1: <input type="text" name="campoPok1"><br/>
	Pokemon 2: <input type="text" name="campoPok2"><br/>
	Pokemon 3: <input type="text" name="campoPok3"><br/>
	<input type="submit" value= "Aceptar"/>
</form>

<!--  <script type="text/javascript" src="js/validacionRegistrarAnuncioCliente.js"> </script> -->



</body>
</html>