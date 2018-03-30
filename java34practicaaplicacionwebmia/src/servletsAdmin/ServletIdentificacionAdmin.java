package servletsAdmin;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import daos.JugadoresDAO;
import daosimpl.JugadoresDAOImpl;


@WebServlet("/ServletIdentificacionAdmin")
public class ServletIdentificacionAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
//		if (request.getSession().getAttribute("identificado")==null) {
//			request.getRequestDispatcher("login.jsp").forward(request, response);
//			
//		}
		
		
		System.out.println("se ejecuta el servlet de identificaicon de admin");
		
		String usuario = request.getParameter("campoUsuario");
		String password = request.getParameter("campoPassword");
		JugadoresDAO jugadoresDAO = new JugadoresDAOImpl();
		if (jugadoresDAO.identificarAdmin(usuario, password)) {
			request.getSession().setAttribute("admin", "ok");
			request.getRequestDispatcher("loginOK.jsp").forward(request, response);
		}else {
			//email y/o pass incorrecto
			request.setAttribute("mensaje", "Usuario y/o contraseña incorrectos");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
	
		
	}

}
