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


@WebServlet("/ServletEditarEquipo")
public class ServletEditarEquipo extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		if (request.getSession().getAttribute("admin")==null) {
			request.getRequestDispatcher("login.jsp").forward(request, response);
			
		}
		
		
		int id = Integer.parseInt(request.getParameter("id"));
		System.out.println("se va a editar el equipo con id: " + id);
		EquiposDAO equipoDAO = new EquiposDAOImpl();
		Equipo equipoEditar = equipoDAO.obtenerEquiposPorId(id);
		request.setAttribute("equipoAEditar", equipoEditar);
		request.getRequestDispatcher("editarEquipo.jsp").forward(request, response);
	}

}
