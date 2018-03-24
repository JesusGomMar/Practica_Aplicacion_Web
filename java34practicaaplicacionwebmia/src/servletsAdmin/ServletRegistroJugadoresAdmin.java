package servletsAdmin;

import java.io.IOException;
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
		//......
		//fin parte de validacion de datos
		
		Jugador nuevoJugador = new Jugador(nombre, calle, numeracion, cp, poblacion, telefono, email, particular_empresa);
		System.out.println("Vamos a registrar al jugador: " + nuevoJugador.toString());
		JugadoresDAO jugadoresDAO = new JugadoresDAOImpl();
		jugadoresDAO.registrarJugadores(nuevoJugador);
		request.getRequestDispatcher("registroJugadorOk.jsp").forward(request, response);

	}

}
