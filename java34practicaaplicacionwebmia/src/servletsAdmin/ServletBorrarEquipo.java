package servletsAdmin;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import daos.EquiposDAO;
import daosimpl.EquiposDAOImpl;


@WebServlet("/ServletBorrarEquipo")
public class ServletBorrarEquipo extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		if (request.getSession().getAttribute("admin")==null) {
			request.getRequestDispatcher("login.jsp").forward(request, response);
			
		}
		
		
		int id = Integer.parseInt(request.getParameter("id"));
		System.out.println("Se va a borrar el equipo de ID: "+ id);
		EquiposDAO equipoDAO = new EquiposDAOImpl();
		// explota al usar borrar equipo
		equipoDAO.borrarEquipo(id);
		request.setAttribute("equipo", equipoDAO.obtenerEquipos());
		request.getRequestDispatcher("ServletListadoEquiposAdmin").forward(request, response);
		
		
	}

}
