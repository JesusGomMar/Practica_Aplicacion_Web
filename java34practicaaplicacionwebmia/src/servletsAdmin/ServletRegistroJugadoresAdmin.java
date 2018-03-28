package servletsAdmin;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import daos.JugadoresDAO;
import daosimpl.JugadoresDAOImpl;
import modelo.Jugador;


@WebServlet("/ServletRegistroJugadoresAdmin")
public class ServletRegistroJugadoresAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		if (request.getSession().getAttribute("identificado")==null) {
//			request.getRequestDispatcher("login.jsp").forward(request, response);
//			
//		}
		
		
		System.out.println("se ejecuta el service del ServletRegistroJugadoresAdmin");
		
		String nombre = request.getParameter("campoNombre");
		String calle = request.getParameter("campoCalle");
		String numeracion = request.getParameter("campoNumeracion");
		String cp = request.getParameter("campoCp");
		String poblacion = request.getParameter("campoPoblacion");
		String telefono = request.getParameter("campoTelefono");
		String email = request.getParameter("campoEmail");
		String particular_empresa = request.getParameter("campoParticular_empresa");
		
		//parte de validacion de datos
		
		String expresionRegularNombre = "[a-zA-Z·ÈÌÛ˙Ò—\\s]{3,25}";
		String expresionRegularCalle = "[a-zA-Z·ÈÌÛ˙Ò—\\s]{3,15}";
		String expresionRegularNumero = "[0-9]{1,3}";
		String expresionRegularCp = "[0-9]{1,5}";
		String expresionRegularPoblacion = "[a-zA-Z·ÈÌÛ˙Ò—\\s]{3,15}";
		String expresionRegularTelefono = "[0-9]{1,14}";
		String expresionRegularEmail = "^[\\w-]+(\\.[\\w-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
		String expresionRegularParticular_empresa = "[a-zA-Z·ÈÌÛ˙Ò—\\s]{3,10}";
		
		Pattern patternNombre = Pattern.compile(expresionRegularNombre);
		Matcher matcherNombre = patternNombre.matcher(nombre);
		if(matcherNombre.matches()) {
			System.out.println("nombre ok");
		}else {
			System.out.println("nombre ko");
			request.setAttribute("mensaje", "nombre no valido");
			request.getRequestDispatcher("registrarJugador.jsp").forward(request, response);
			return;
		}
		
		
		
		Pattern patternCalle = Pattern.compile(expresionRegularCalle);
		Matcher matcherCalle = patternCalle.matcher(calle);
		if(matcherCalle.matches()) {
			System.out.println("calle ok");
		}else {
			System.out.println("calle ko");
			request.setAttribute("mensaje", "calle no valida");
			request.getRequestDispatcher("registrarJugador.jsp").forward(request, response);
			return;
		}
		
		
		
		Pattern patternNumero = Pattern.compile(expresionRegularNumero);
		Matcher matcherNumero = patternNumero.matcher(numeracion);
		if(matcherNumero.matches()) {
			System.out.println("numero ok");
		}else {
			System.out.println("numero ko");
			request.setAttribute("mensaje", "numero no valido");
			request.getRequestDispatcher("registrarJugador.jsp").forward(request, response);
			return;
		}
		
		
		
		Pattern patternCp = Pattern.compile(expresionRegularCp);
		Matcher matcherCp = patternCp.matcher(cp);
		if(matcherCp.matches()) {
			System.out.println("Cp ok");
		}else {
			System.out.println("Cp ko");
			request.setAttribute("mensaje", "Cp no valido");
			request.getRequestDispatcher("registrarJugador.jsp").forward(request, response);
			return;
		}
		
		
		
		Pattern patternPoblacion = Pattern.compile(expresionRegularPoblacion);
		Matcher matcherPoblacion = patternPoblacion.matcher(poblacion);
		if(matcherPoblacion.matches()) {
			System.out.println("poblacion ok");
		}else {
			System.out.println("poblacion ko");
			request.setAttribute("mensaje", "poblacion no valida");
			request.getRequestDispatcher("registrarJugador.jsp").forward(request, response);
			return;
		}
		
		
		
		Pattern patternTelefono = Pattern.compile(expresionRegularTelefono);
		Matcher matcherTelefono = patternTelefono.matcher(telefono);
		if(matcherTelefono.matches()) {
			System.out.println("Telefono ok");
		}else {
			System.out.println("telefono ko");
			request.setAttribute("mensaje", "telefono no valido");
			request.getRequestDispatcher("registrarJugador.jsp").forward(request, response);
			return;
		}
		
		
		
		Pattern patternEmail = Pattern.compile(expresionRegularEmail);
		Matcher matcherEmail = patternEmail.matcher(email);
		if(matcherEmail.matches()) {
			System.out.println("email ok");
		}else {
			System.out.println("email ko");
			request.setAttribute("mensaje", "email no valido");
			request.getRequestDispatcher("registrarJugador.jsp").forward(request, response);
			return;
		}
		
		
		
		Pattern patternParticular_empresa = Pattern.compile(expresionRegularParticular_empresa);
		Matcher matcherParticular_empresa = patternParticular_empresa.matcher(particular_empresa);
		if(matcherParticular_empresa.matches()) {
			System.out.println(" Particular_empresa ok");
		}else {
			System.out.println("Particular_empresa  ko");
			request.setAttribute("mensaje", "Particular_empresa no valido");
			request.getRequestDispatcher("registrarJugador.jsp").forward(request, response);
			return;
		}
		
		
		
		//......
		//fin parte de validacion de datos
		
		Jugador nuevoJugador = new Jugador(nombre, calle, numeracion, cp, poblacion, telefono, email, particular_empresa);
		System.out.println("Vamos a registrar al jugador: " + nuevoJugador.toString());
		JugadoresDAO jugadoresDAO = new JugadoresDAOImpl();
		jugadoresDAO.registrarJugadores(nuevoJugador);
		request.getRequestDispatcher("registroJugadorOk.jsp").forward(request, response);

	}

}
