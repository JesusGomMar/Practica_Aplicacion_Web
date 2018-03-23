package daosimpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import daos.ConstantesSQL;
import daos.GenericDAO;
import daos.JugadoresDAO;
import modelo.Jugador;
import modelo.Equipo;

public class JugadoresDAOImpl extends GenericDAO implements JugadoresDAO{

	@Override
	//registramos a los jugadores
	public void registrarJugadores(Jugador jugador) {
		conectar();
		try {
			PreparedStatement ps = miConexion.prepareStatement(ConstantesSQL.INSERCCION_JUGADOR);
			
			ps.setString(1, jugador.getNombre());
			ps.setString(2, jugador.getCalle());
			ps.setString(3, jugador.getNumeracion());
			ps.setString(4, jugador.getCp());
			ps.setString(5, jugador.getPoblacion());
			ps.setString(6, jugador.getTelefono());
			ps.setString(7, jugador.getEmail());
			ps.setString(8, jugador.getParticular_empresa());
			ps.execute();
			ps.close();
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("la sql de insercion el anuncio esta mal");

		}
		desconectar();
		
		
	}



	@Override
	public void borrarJugador(int id) {
		//borramos jugador seleccionado
		conectar();
		
		try {
			PreparedStatement ps = miConexion.prepareStatement(ConstantesSQL.BORRADO_JUGADOR_ADMIN);
			ps.setInt(1, id);
			ps.execute();
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("sql borrado jugador esta mal");
		}
		
		desconectar();
		
	}

	@Override
	public List<Jugador> obtenerJugadores() {
		
		conectar();
		List<Jugador> jugadores = new ArrayList<Jugador>();
		try {
			PreparedStatement ps = miConexion.prepareStatement(ConstantesSQL.SELECCION_JUGADOR);
			ResultSet resultado = ps.executeQuery();
					while (resultado.next()) {
						
						Jugador jugador = new Jugador();
						jugador.setNombre(resultado.getString("nombre"));
						jugador.setCalle(resultado.getString("calle"));
						jugador.setNumeracion(resultado.getString("numeracion"));
						jugador.setCp(resultado.getString("cp"));
						jugador.setPoblacion(resultado.getString("poblacion"));
						jugador.setTelefono(resultado.getString("telefono"));
						jugador.setEmail(resultado.getString("email"));
						jugador.setParticular_empresa(resultado.getString("partucular_empresa"));
						jugador.setId(resultado.getInt("id"));
						
						jugadores.add(jugador);
						
					}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("sql jugador esta mal");
		}
		desconectar();
		
		
		return jugadores;
	}

	@Override
	public boolean identificarAdmin(String usuario, String password) {
		// va a la sql de admin y comprueba si los datos son ok
		boolean identificado = false;
		conectar();
		
		try {
			PreparedStatement ps = miConexion.prepareStatement(ConstantesSQL.IDENTIFICACION_ADMIN);
			
			ps.setString(1, usuario);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				//si este if cumple, eso es q he obtenido un resultado de db
				identificado = true;
				
			}
			
		} catch (SQLException e) {
			System.out.println("sql de identificacion tiene problemas");
			System.out.println(e.getMessage());
		}
		
		
		desconectar();
		return identificado;
		
	}

}
