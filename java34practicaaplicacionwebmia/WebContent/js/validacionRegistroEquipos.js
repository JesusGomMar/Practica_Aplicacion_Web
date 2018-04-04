function validacionRegistroEquipos() {
//	alert("se ejecuta la funcion");
	
	var enviarForm = true;
	// obtener lo escrito por el user 
	
	var campoNombre_jugador = document.getElementsByName("campoNombre_jugador")[0];
	var nombre_jugador = campoNombre_jugador.value;
//	alert("voy a validar: "+ nombre_jugador)
	var campoNombre_equipo = document.getElementsByName("campoNombre_equipo")[0];
	var nombre_equipo = campoNombre_equipo.value;
//	alert("voy a validar: "+ nombre_equipo)
	var campoFecha = document.getElementsByName("campoFecha")[0];
	var fecha = campoFecha.value;
//	alert("voy a validar: "+ fecha)
	var campoLegendarios = document.getElementsByName("campoLegendarios")[0];
	var legendarios = campoLegendarios.value;
//	alert("voy a validar: "+ legendarios)
	var campoPok1 = document.getElementsByName("campoPok1")[0];
	var pok1 = campoPok1.value;
//	alert("voy a validar: "+ pok1)
	var campoPok2 = document.getElementsByName ("campoPok2")[0];
	var pok2 = campoPok2.value;
//	alert("voy a validar: " + pok2)
	var campoPok3 = document.getElementsByName ("campoPok3")[0];
	var pok3 = campoPok3.value;
//	alert("voy a validar: "+ pok3)

	
	
	// comprobar q sea correcto
	// las expresiones regulares son vitales para realizar validaciones
	// ^ indica desde el principio, $ indica hasta el fin
	//[a-z] letras de la a a la z
	//{3,10} indica de 3 a 10 elementos
	// /i es insensitive, acepta mayusculas y no
	// \s acepta espacios
	var expresionCampoNombre_jugador = /^[a-zA-ZáéíóúñÑ\\s]{3,25}$/;
	if (expresionCampoNombre_jugador.test(nombre_jugador)){
//		alert("nombre_jugador ok");
	}else{
		alert("nombre_jugador ko");
		enviarForm = false;
	}
	
	var expresionCampoNombre_equipo = /^[a-zA-ZáéíóúñÑ\\s]{3,10}$/;
	if(expresionCampoNombre_equipo.test(nombre_equipo)){
//		alert("nombre_equipo ok");
	}else{
		alert(" nombre_equipo ko")
		enviarForm = false;
	}	
	
	var expresionCampoFecha = /^[0-9\\-\\/]{1,10}$/;
	if(expresionCampoFecha.test(fecha)){
//		alert("fecha ok");
	}else{
		alert(" fecha ko")
		enviarForm = false;
	}	
	
	var expresionCampoLegendario = /^[a-zA-Z]{3,14}$/;
	if(expresionCampoLegendario.test(legendarios)){
//		alert("legendarios ok");
	}else{
		alert(" legendarios ko")
		enviarForm = false;
	}
	
	var expresionCampoPok = /^[a-zA-Z]{3,10}$/;
	if(expresionCampoPok.test(pok1)){
//		alert("pok1 ok");
	}else{
		alert(" pok1 ko")
		enviarForm = false;
	}
	
	if(expresionCampoPok.test(pok2)){
//		alert("pok2 ok");
	}else{
		alert(" pok2 ko")
		enviarForm = false;
	}
	
	if(expresionCampoPok.test(pok3)){
//		alert("pok3 ok");
	}else{
		alert(" pok3 ko")
		enviarForm = false;
	}
	

	
	// devolver true si todo ok, o false si hay algo mal
	
	return enviarForm;
	
	
	
}