<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registro Jugador</title>
</head>
<body>

<a href = "index.jsp">volver a inicio</a><br/>
Introduce los datos de usuario:<br/>
<form action="ServletRegistroJugadoresAdmin" method="post" enctype="multipart/form-data" >

	Nombre: <input type="text" name="campoNombre"/><br/>
	Calle: <input type="text" name="campoCalle"/><br/>
	Numero: <input type="number" name = "campoNumeracion"><br/>
	Codigo Postal: <input type="number" name = "campoCp"><br/>
	Poblaci�n: <input type="text" name="campoPoblacion"><br/>
	Tel�fono: <input type="number" name="campoTelefono"><br/>
	Email: <input type="email" name="campoEmail"><br/>
	Particular/Empresa: <input type="radio" name="campoParticular_empresa" value="particular" checked>Particular &nbsp;
						<input type="radio" name="campoParticular_empresa" value="empresa">Empresa<br/>
	Fotografia: <input type="file" name= "campoImagen"><br/>
	
	<input type="submit" value= "Aceptar"/>


</form>
<!--  
<script type="text/javascript" src="js/validacionRegistroJugadores.js"></script>
onsubmit="return validarFormularioRegistroJugador()" 
-->


</body>
</html>