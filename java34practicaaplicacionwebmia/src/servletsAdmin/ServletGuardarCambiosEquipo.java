package servletsAdmin;

import java.io.IOException;
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
		
//		if (request.getSession().getAttribute("identificado")==null) {
//			request.getRequestDispatcher("login.jsp").forward(request, response);
//			
//		}
		
		
		String nombre_jugador = request.getParameter("campoNombre_jugador");
		String nombre_equipo = request.getParameter("campoNombre_equipo");
		String fecha = request.getParameter("campoFecha");
		String legendarios = request.getParameter("campoLegendarios");
		String pok1 = request.getParameter("campoPok1");
		String pok2 = request.getParameter("campoPok2");
		String pok3 = request.getParameter("campoPok3");
		String id = request.getParameter("campoId");

		//ahora deberiamos validar todos los parametros
		
		// fin parte validacion

		Equipo equipo = new Equipo(nombre_jugador, nombre_equipo, fecha, legendarios, pok1, pok2, pok3);
		equipo.setId(Integer.parseInt(id));
		EquiposDAO equiposDAO = new EquiposDAOImpl();
		equiposDAO.guardarCambiosEquipo(equipo);
		
		request.getRequestDispatcher("ServletListadoEquiposAdmin").forward(request, response);
		
		
	}

}
