<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Administraci�n jugadores</title>
</head>
<body>



<jsp:include page="menu.jsp"></jsp:include>
<c:forEach items="${jugadores}" var="jugador">

 	<div style="margin: 8px">
 		Nombre: ${jugador.nombre}<br/>
 		Calle: ${jugador.calle }<br/>
 		C�digo Postal: ${jugador.cp }<br/>
 		Poblaci�n: ${jugador.poblacion }<br/>
 		Tel�fono: ${jugador.telefono }<br/>
 		Email: ${jugador.email }<br/>
 		Particular/Empresa: ${jugador.particular_empresa }<br/>


 		<a href="ServletBorrarJugador?id=${jugador.id}">BORRAR</a>
	</div>

</c:forEach>

</body>
</html>