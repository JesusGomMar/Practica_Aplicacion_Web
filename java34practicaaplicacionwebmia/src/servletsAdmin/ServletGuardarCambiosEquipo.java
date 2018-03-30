package servletsAdmin;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import daos.EquiposDAO;
import daosimpl.EquiposDAOImpl;
import modelo.Equipo;


@WebServlet("/ServletGuardarCambiosEquipo")
public class ServletGuardarCambiosEquipo extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		if (request.getSession().getAttribute("admin")==null) {
			request.getRequestDispatcher("login.jsp").forward(request, response);
			
		}
		
		
		String nombre_jugador = request.getParameter("campoNombre_jugador");
		String nombre_equipo = request.getParameter("campoNombre_equipo");
		String fecha = request.getParameter("campoFecha");
		String legendarios = request.getParameter("campoLegendarios");
		String pok1 = request.getParameter("campoPok1");
		String pok2 = request.getParameter("campoPok2");
		String pok3 = request.getParameter("campoPok3");
		String id = request.getParameter("campoId");

		//ahora deberiamos validar todos los parametros
		
		String expresionRegularNombre_jugador = "[a-zA-Z·ÈÌÛ˙Ò—\\s]{3,25}";
		String expresionRegularNombre_equipo = "[a-zA-Z·ÈÌÛ˙Ò—\\s]{3,10}";
		String expresionRegularFecha = "[0-9\\-\\/]{1,10}";
		String expresionRegularLegendario = "[a-zA-Z]{3,14}";
		String expresionRegularPok = "[a-zA-Z]{3,10}";
		
		
		Pattern patternNombre_jugador = Pattern.compile(expresionRegularNombre_jugador);
		Matcher matcherNombreJugador = patternNombre_jugador.matcher(nombre_jugador);
		if(matcherNombreJugador.matches()) {
			System.out.println("nombre ok");
		}else {
			System.out.println("nombre ko");
			request.setAttribute("mensaje", "nombre no valido");
			request.getRequestDispatcher("registrarEquipo.jsp").forward(request, response);
			return;
		}
		
		
		
		Pattern patternNombre_equipo = Pattern.compile(expresionRegularNombre_equipo);
		Matcher matcherNombre_equipo = patternNombre_equipo.matcher(nombre_equipo);
		if(matcherNombre_equipo.matches()) {
			System.out.println("nombre equipo ok");
		}else {
			System.out.println("nombre equipo ko");
			request.setAttribute("mensaje", "nombre no valido");
			request.getRequestDispatcher("registrarEquipo.jsp").forward(request, response);
			return;
		}
		
		Pattern patternFecha = Pattern.compile(expresionRegularFecha);
		Matcher matcherFecha = patternFecha.matcher(fecha);
		if(matcherFecha.matches()) {
			System.out.println("fecha ok");
		}else {
			System.out.println("fecha ko");
			request.setAttribute("mensaje", "fecha no valida");
			request.getRequestDispatcher("registrarEquipo.jsp").forward(request, response);
			return;
		}
		
		Pattern patternLegendario = Pattern.compile(expresionRegularLegendario);
		Matcher matcherLegendario = patternLegendario.matcher(legendarios);
		if(matcherLegendario.matches()) {
			System.out.println("legendario ok");
		}else {
			System.out.println("legendario ko");
			request.setAttribute("mensaje", "legendario no valido");
			request.getRequestDispatcher("registrarEquipo.jsp").forward(request, response);
			return;
		}
		
		Pattern patternPok1 = Pattern.compile(expresionRegularPok);
		Matcher matcherPok1 = patternPok1.matcher(pok1);
		if(matcherPok1.matches()) {
			System.out.println("pok1 ok");
		}else {
			System.out.println("pok1 ko");
			request.setAttribute("mensaje", "pok1 no valida");
			request.getRequestDispatcher("registrarEquipo.jsp").forward(request, response);
			return;
		}
		
		Pattern patternPok2 = Pattern.compile(expresionRegularPok);
		Matcher matcherPok2 = patternPok1.matcher(pok2);
		if(matcherPok2.matches()) {
			System.out.println("pok2 ok");
		}else {
			System.out.println("pok2 ko");
			request.setAttribute("mensaje", "pok2 no valida");
			request.getRequestDispatcher("registrarEquipo.jsp").forward(request, response);
			return;
		}
		
		Pattern patternPok3 = Pattern.compile(expresionRegularPok);
		Matcher matcherPok3 = patternPok3.matcher(pok3);
		if(matcherPok3.matches()) {
			System.out.println("pok3 ok");
		}else {
			System.out.println("pok3 ko");
			request.setAttribute("mensaje", "pok3 no valida");
			request.getRequestDispatcher("registrarEquipo.jsp").forward(request, response);
			return;
		}
		
		// fin parte validacion

		Equipo equipo = new Equipo(nombre_jugador, nombre_equipo, fecha, legendarios, pok1, pok2, pok3);
		System.out.println("equipo editado: " + equipo.toString());
		equipo.setId(Integer.parseInt(id));
		EquiposDAO equiposDAO = new EquiposDAOImpl();
		equiposDAO.guardarCambiosEquipo(equipo);
		
		request.getRequestDispatcher("ServletListadoEquiposAdmin").forward(request, response);
		
		
	}

}
