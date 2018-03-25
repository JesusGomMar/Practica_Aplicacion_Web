<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edicion Admin Equipo</title>
</head>
<body>



<jsp:include page="menu.jsp"></jsp:include>

<form action="ServletGuardarCambiosEquipo" method="post">
	Nombre del Jugador: <input type="text" name= "campoNombre_jugador" value="${equipoAEditar.nombre_jugador}"/><br/>
	Nombre del Equipo: <input type="text" name= "campoNombre_equipo" value="${equipoAEditar.nombre_equipo}"/><br/>
	Fecha:<input type="date" name= "campoFecha" value="${equipoAEditar.fecha}"/><br/>
	Legendarios: <input type="text" name= "campoLegendarios" value="${equipoAEditar.legendarios}"/><br/>
	Pokemon 1: <input type="text" name= "campoPok1" value="${equipoAEditar.pok1}"/><br/>
	Pokemon 2: <input type="text" name= "campoPok2" value="${equipoAEditar.pok2}"/><br/>
	Pokemon 3: <input type="text" name= "campoPok3" value="${equipoAEditar.pok3}"/><br/>
	<input type="hidden" name="campoId" value="${equipoAEditar.id}"/>
	<input type="submit" value="GUARDAR CAMBIOS"/>



</form>

</body>
</html>