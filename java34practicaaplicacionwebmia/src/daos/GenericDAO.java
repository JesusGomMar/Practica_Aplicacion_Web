package daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// de esta clase solo se va a poder heredar
public abstract class GenericDAO {

	protected Connection miConexion = null;

	// carga del driver de conexion con jdbc
	static {
		// este es un bloque especial que se ejecutauna unica vez a lo largo
		// de la aplicacion la primera vez que sta clase es usada
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("No se encuentra la libreria de mysql");
		}
	}

	protected void conectar() {

		try {
			miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/portal_equipos", "root",
					"jeveris");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(" no pude conectarme a la DB");
			System.out.println(" comprobar ruta de la DB");
			System.out.println(" comprobar nombre de usuario y contraseña");
		}

	}

	protected void desconectar() {

		try {
			miConexion.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("no pude realizar la desconexion");
		}

	}

}
