<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<!-- usamos jsp para evitar que si nos cambian la url accedan sin meter user y pass -->
<c:if test="${sessionScope.admin == null}">
	<jsp:forward page="login.jsp"></jsp:forward>
</c:if>
<!-- hacemos las llamadas a las diferentes opciones de administracion -->
<a href = "ServletListadoJugadoresAdmin">Gestionar Jugadores</a>&nbsp;
<a href = "ServletListadoEquiposAdmin">Gestionar Equipos</a>&nbsp;
<a href = "ServletLogOutAdmin">SALIR</a>&nbsp;
<a href = "ServletRegistroJugadoresAdmin">Registrar Jugadores</a> &nbsp;
<a href = "ServletRegistroEquiposAdmin">Registrar Equipos</a> &nbsp;
