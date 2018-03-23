<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Administración de Equipos</title>
</head>
<body>



<jsp:include page="menu.jsp"></jsp:include>
<c:forEach items="${equipos}" var="equipo">

 	<div style="margin: 8px">
 		Nombre del Jugador: ${equipo.nombre_jugador}<br/>
 		Nombre del Equipo: ${equipo.nombre_equipo }<br/>
 		Fecha: ${equipo.fecha }<br/>
 		Legendarios: ${equipo.legendarios }<br/>
 		Pokemon 1: ${equipo.pok1 }<br/>
 		Pokemon 2: ${equipo.pok2 }<br/>
 		Pokemon 3: ${equipo.pok3 }<br/>
 		<a href="ServletBorrarEquipo?id=${equipo.id}">BORRAR</a>
 		<a href="ServletEditarEquipo?id=${equipo.id}">EDITAR</a>
	</div>

</c:forEach>

</body>
</html>