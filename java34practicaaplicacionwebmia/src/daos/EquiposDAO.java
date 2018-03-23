package daos;

import java.util.List;

import modelo.Equipo;;

public interface EquiposDAO {
	
	void registrarEquipo (Equipo equipo);
	void borrarEquipo(int id);
	
	List<Equipo> obtenerEquipos();
	Equipo obtenerEquiposPorId(int id);
	void guardarCambiosEquipo(Equipo equipo);
	

}
