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
<form action="ServletRegistroJugadoresAdmin" method="post">

	Nombre: <input type="text" name="campoNombre"/><br/>
	Calle: <input type="text" name="campoCalle"/><br/>
	Numero: <input type="number" name = "campoNumeracion"><br/>
	Codigo Postal: <input type="number" name = "campoCp"><br/>
	Población: <input type="text" name="campoPoblacion"><br/>
	Email: <input type="email" name="campoEmail"><br/>
	Particular/Empresa: <input type="text" name="campoParticular_empresa"><br/>

	<input type="submit" value= "Aceptar"/>




</form>

</body>
</html>