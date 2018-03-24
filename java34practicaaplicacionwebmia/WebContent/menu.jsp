<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<!-- usamos jsp para evitar que si nos cambian la url accedan sin meter user y pass -->
<c:if test="${sessionScope.admin == null}">
	<jsp:forward page="login.jsp"></jsp:forward>
</c:if>
<!-- hacemos las llamadas a las diferentes opciones de administracion -->
<a href = "ServletListadoJugadoresAdmin">Gestionar Jugadores</a>&nbsp;
<a href = "ServletListadoEquiposAdmin">Gestionar Equipos</a>&nbsp; </br>
<a href = "registrarJugador.jsp">Registrar Jugador</a> &nbsp;
<a href = "registrarEquipo.jsp">Registrar Equipo</a> &nbsp; </br>
<a href = "ServletLogOutAdmin">SALIR</a>&nbsp; </br>
