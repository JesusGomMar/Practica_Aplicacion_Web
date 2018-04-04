function validarFormularioRegistroJugador() {
//	alert("se ejecuta la funcion");
	
	var enviarForm = true;
	// obtener lo escrito por el user 
	
	var campoNombre = document.getElementsByName("campoNombre")[0];
	var nombre = campoNombre.value;
//	alert("voy a validar: "+ nombre)
	var campoCalle = document.getElementsByName("campoCalle")[0];
	var calle = campoCalle.value;
//	alert("voy a validar: "+ calle)
	var campoNumeracion = document.getElementsByName("campoNumeracion")[0];
	var numeracion = campoNumeracion.value;
//	alert("voy a validar: "+ numeracion)
	var campoCp = document.getElementsByName("campoCp")[0];
	var cp = campoCp.value;
//	alert("voy a validar: "+ cp)
	var campoPoblacion = document.getElementsByName("campoPoblacion")[0];
	var poblacion = campoPoblacion.value;
//	alert("voy a validar: "+ poblacion)
	var campoTelefono = document.getElementsByName ("campoTelefono")[0];
	var telefono = campoTelefono.value;
//	alert("voy a validar: " + telefono)
	var campoEmail = document.getElementsByName ("campoEmail")[0];
	var email = campoEmail.value;
//	alert("voy a validar: "+ email)
	var campoParticular_empresa = document.getElementsByName ("campoParticular_empresa")[0];
	var particular_empresa = campoParticular_empresa.value;
//	alert("voy a validar: "+ particular_empresa)
	
	
	// comprobar q sea correcto
	// las expresiones regulares son vitales para realizar validaciones
	// ^ indica desde el principio, $ indica hasta el fin
	//[a-z] letras de la a a la z
	//{3,10} indica de 3 a 10 elementos
	// /i es insensitive, acepta mayusculas y no
	// \s acepta espacios
	var expresionCampoNombre = /^[a-zA-ZáéíóúñÑ\s]{3,25}$/;
	if (expresionCampoNombre.test(nombre)){
//		alert("nombre ok");
	}else{
		alert("nombre ko");
		enviarForm = false;
	}
	
	var expresionCampoCalle = /^[a-zA-ZáéíóúñÑ\\s]{3,15}$/;
	if(expresionCampoCalle.test(calle)){
//		alert("calle ok");
	}else{
		alert(" calle ko")
		enviarForm = false;
	}	
	
	var expresionCampoNumero = /^[0-9]{1,3}$/;
	if(expresionCampoNumero.test(numeracion)){
//		alert("numero ok");
	}else{
		alert(" numero ko")
		enviarForm = false;
	}	
	
	var expresionCampoCp = /^[0-9]{1,5}$/;
	if(expresionCampoCp.test(cp)){
//		alert("cp ok");
	}else{
		alert(" cp ko")
		enviarForm = false;
	}
	
	var expresionCampoPoblacion = /^[a-zA-ZáéíóúñÑ\\s]{3,15}$/;
	if(expresionCampoPoblacion.test(poblacion)){
//		alert("poblacion ok");
	}else{
		alert(" poblacion ko")
		enviarForm = false;
	}
	
	var expresionCampoTelefono = /^[0-9]{1,14}$/;
	if(expresionCampoTelefono.test(telefono)){
//		alert("telefono ok");
	}else{
		alert(" telefono ko")
		enviarForm = false;
	}
	
	var expresionCampoEmail = /^[\\w-]+(\\.[\\w-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$/;
	if(expresionCampoEmail.test(email)){
//		alert("email ok");
	}else{
		alert(" email ko")
		enviarForm = false;
	}
	
	var expresionCampoParticular_empresa = /^[a-zA-ZáéíóúñÑ\\s]{3,10}$/;
	if(expresionCampoParticular_empresa.test(particular_empresa)){
//		alert("particular_empresa ok");
	}else{
		alert(" particular_empresa ko")
		enviarForm = false;
	}
	
	// devolver true si todo ok, o false si hay algo mal
	
	return enviarForm;
	
	
	
}