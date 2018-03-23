package servletsAdmin;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import daos.JugadoresDAO;
import daosimpl.JugadoresDAOImpl;


@WebServlet("/ServletListadoJugadoresAdmin")
public class ServletListadoJugadoresAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
//		if (request.getSession().getAttribute("identificado")==null) {
//			request.getRequestDispatcher("login.jsp").forward(request, response);
//			
//		}
		
		System.out.println("obteniendo jugadores para gestionarlos en administracion");
		
		JugadoresDAO jugadoresDAO = new JugadoresDAOImpl();
		request.setAttribute("jugadores", jugadoresDAO.obtenerJugadores());
		request.getRequestDispatcher("gestionJugadores.jsp").forward(request, response);
		
		
	}

}
