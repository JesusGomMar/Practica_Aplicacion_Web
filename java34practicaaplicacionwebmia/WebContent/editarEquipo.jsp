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

<form action="ServletGuardarCambiosEquipo" method="post" >
	Nombre del Jugador: <input type="text" name= "campoNombre_jugador" value="${equipoAEditar.nombre_jugador}"/><br/>
	Nombre del Equipo: <input type="text" name= "campoNombre_equipo" value="${equipoAEditar.nombre_equipo}"/><br/>
	Fecha:<input type="date" name= "campoFecha" value="${equipoAEditar.fecha}"/><br/>
	Legendarios: <input type="radio" name="campoLegendarios" value="conLegendarios" checked>Si &nbsp;
				 <input type="radio" name="campoLegendarios" value="sinLegendarios">No<br/>
	Pokemon 1:<select name="campoPok1">
  					<option value="bulbasur">Bulbasur</option>
 					<option value="squirtle">Squirtle</option>
  					<option value="charmander">Charmander</option>
  					<option value="pikachu">Pikachu</option>
			</select><br/>
	Pokemon 2:<select name="campoPok2">
  					<option value="ivysaur">Ivysaur</option>
 					<option value="wartortle">Wartortle</option>
  					<option value="charmeleon">Charmeleon</option>
  					<option value="raichu">Raichu</option>
				</select><br/>
	Pokemon 3: <select name="campoPok3">
  					<option value="venusaur">Venusaur</option>
 					<option value="blastoise">Blastoise</option>
  					<option value="charizard">Charizard</option>
  					<option value="mew">Mew</option>
				</select><br/>
	<input type="hidden" name="campoId" value="${equipoAEditar.id}"/>
	
	<input type="submit" value="GUARDAR CAMBIOS"/>



</form>
<!--  
<script type="text/javascript" src="js/validacionGuardarCambiosEquipo.js"></script>
onsubmit="return validarFormularioGuardarCambiosEquipo()"
-->



</body>
</html>