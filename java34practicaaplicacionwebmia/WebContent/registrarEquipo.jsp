<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registro Equipo</title>
</head>
<body>

<a href = "index.jsp">volver a inicio</a><br/>

Introduce los datos de tu Equipo:<br/>
<form action="ServletRegistroEquiposAdmin" method="post" >

	Nombre Jugador: <input type="text" name="campoNombre_jugador"/><br/>
	Nombre Equipo: <input type="text" name="campoNombre_equipo"/><br/>
	Fecha:  <input type="date" name="campoFecha"/><br/>
	Legendarios: <input type="radio" name="campoLegendarios" value="conLegendarios" checked>Si &nbsp;
				 <input type="radio" name="campoLegendarios" value="sinLegendarios">No<br/>
	Pokemon 1:<select name="campoPok1">
  					<option value="bulbasur">Bulbasur</option>
 					<option value="squirtle">Squirtle</option>
  					<option value="charmander">Charmander</option>
  					<option value="pikachu">Pikachu</option>
				</select><br/>
				
	Pokemon 2: <select name="campoPok2">
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
	
	<script type="text/javascript" src="js/validacionRegistroEquipos.js"> </script> 
	<input type="submit" value= "Aceptar"/>
</form>





</body>
</html>