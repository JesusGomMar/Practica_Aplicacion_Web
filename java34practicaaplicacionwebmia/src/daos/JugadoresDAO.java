package daos;

import java.util.List;

import modelo.Jugador;

public interface JugadoresDAO {
	
	void registrarJugadores (Jugador jugador);
	void borrarJugador (int id);
	
	List<Jugador> obtenerJugadores();
	
	boolean identificarAdmin(String usuario, String password);
}
