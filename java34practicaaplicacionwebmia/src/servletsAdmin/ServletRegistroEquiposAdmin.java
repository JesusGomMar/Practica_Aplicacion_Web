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


@WebServlet("/ServletRegistroEquiposAdmin")
public class ServletRegistroEquiposAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
//		if (request.getSession().getAttribute("identificado")==null) {
//			request.getRequestDispatcher("login.jsp").forward(request, response);
//			
//		}
		
		
		System.out.println("se ejecuta el service del ServletRegistroEquiposAdmin");
		
		String nombre_jugador = request.getParameter("campoNombre_jugador");
		String nombre_equipo = request.getParameter("campoNombre_equipo");
		String fecha = request.getParameter("campoFecha");
		String legendario = request.getParameter("campoLegendarios");
		String pok1 = request.getParameter("campoPok1");
		String pok2 = request.getParameter("campoPok2");
		String pok3 = request.getParameter("campoPok3");
		
		//parte de validacion de datos
		
		String expresionRegularNombre_jugador = "[a-zA-Z·ÈÌÛ˙Ò—\\s]{3,25}";
		String expresionRegularNombre_equipo = "[a-zA-Z·ÈÌÛ˙Ò—\\s]{3,10}";
		
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
		
		//fin parte de validacion de datos
		
		Equipo nuevoEquipo = new Equipo(nombre_jugador, nombre_equipo, fecha, legendario, pok1, pok2, pok3);
		System.out.println("vamos a requistrar el equipo: " + nuevoEquipo.toString());
		EquiposDAO equiposDAO = new EquiposDAOImpl();
		equiposDAO.registrarEquipo(nuevoEquipo);
		request.getRequestDispatcher("registroEquipoOk.jsp").forward(request, response);
		
		
	}

}
