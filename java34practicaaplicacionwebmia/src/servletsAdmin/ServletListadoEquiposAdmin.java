package servletsAdmin;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import daos.EquiposDAO;
import daosimpl.EquiposDAOImpl;




@WebServlet("/ServletListadoEquiposAdmin")
public class ServletListadoEquiposAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//		if (request.getSession().getAttribute("identificado")==null) {
//			request.getRequestDispatcher("login.jsp").forward(request, response);
//			
//		}
		
		System.out.println("obteniendo equipos para gestionarlos en administracion");
		
		EquiposDAO equiposDAO = new EquiposDAOImpl();
		request.setAttribute("equipos", equiposDAO.obtenerEquipos());
		request.getRequestDispatcher("gestionEquipos.jsp").forward(request, response);
		
	
		
	}

}
