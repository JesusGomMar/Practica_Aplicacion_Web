package servletsAdmin;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletLogOutAdmin")
public class ServletLogOutAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		if (request.getSession().getAttribute("admin")==null) {
			request.getRequestDispatcher("login.jsp").forward(request, response);
			
		}
		
		// vuelve a index, el cual nos vuelve a llevar a menu, pidiendo de nuevo user y pass
		request.getSession().invalidate();
		request.getRequestDispatcher("logOutOK.jsp").forward(request, response);
	}

}
