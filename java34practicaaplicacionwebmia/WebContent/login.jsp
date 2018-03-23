<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Administradores</title>
</head>
<body>



Introduce tus datos para identificarte como administrador: <br/>

<div style="color: red">&nbsp;${mensaje}</div>

<form action="ServletIdentificacionAdmin" method="post">
	Usuario: <input type="text" name="campoUsuario"><br/>
	Contraseña: <input type="password" name="campoPassword"><br/>
	<input type="submit" value="ENTRAR"/>
</form>
</body>
</html>