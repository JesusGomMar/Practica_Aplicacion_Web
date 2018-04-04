package daosimpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import daos.ConstantesSQL;
import daos.EquiposDAO;
import daos.GenericDAO;
import modelo.Equipo;

public class EquiposDAOImpl extends GenericDAO implements EquiposDAO {

	@Override
	public void registrarEquipo(Equipo equipo) {

		conectar();
		try {
			PreparedStatement ps = miConexion.prepareStatement(ConstantesSQL.INSERCCION_EQUIPO);
			
			ps.setString(1, equipo.getNombre_jugador());
			ps.setString(2, equipo.getNombre_equipo());
			ps.setString(3, equipo.getFecha());
			ps.setString(4, equipo.getLegendarios());
			ps.setString(5, equipo.getPok1());
			ps.setString(6, equipo.getPok2());
			ps.setString(7, equipo.getPok3());
			ps.execute();
			ps.close();
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("la sql de insercion del equipo esta mal");
			System.out.println(e.getMessage());
		}
		desconectar();		
		
	}

	@Override
	public void borrarEquipo(int id) {
		conectar();
		try {
			System.out.println("se va a cargar la sql en ps");
			// llega hasta aki ok, id ok, da null pointerexception
			// PreparedStatement ps = miConexion.prepareStatement(ConstantesSQL.BORRADO_EQUIPO_ADMIN);
			   PreparedStatement ps = miConexion.prepareStatement(ConstantesSQL.BORRADO_EQUIPO_ADMIN);
			System.out.println("ps: " + ps);
			ps.setInt(1, id);
			ps.execute();
			ps.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("sql borrado equipo esta mal");
			System.out.println(e.getMessage());
		}
		
		desconectar();
		
	}

	@Override
	public List<Equipo> obtenerEquipos() {
		
		conectar();
		List<Equipo> equipos = new ArrayList<Equipo>();
		try {
			PreparedStatement ps = miConexion.prepareStatement(ConstantesSQL.SELECCION_EQUIPO);
			ResultSet resultado = ps.executeQuery();
					while (resultado.next()) {
						
						Equipo equipo = new Equipo();
						equipo.setNombre_jugador(resultado.getString("nombre_jugador"));
						equipo.setNombre_equipo(resultado.getString("nombre_equipo"));
						equipo.setFecha(resultado.getString("fecha"));
						equipo.setLegendarios(resultado.getString("legendarios"));
						equipo.setPok1(resultado.getString("pok1"));
						equipo.setPok2(resultado.getString("pok2"));
						equipo.setPok3(resultado.getString("pok3"));
						equipo.setId(resultado.getInt("id"));
						equipos.add(equipo);
						
					}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("sql  seleccion de equipos esta mal");
			System.out.println(e.getMessage());
		}
		desconectar();
		
		
		return equipos;
	}

	@Override
	public Equipo obtenerEquiposPorId(int id) {

		conectar();
		
		Equipo equipo = new Equipo();
		try {
			PreparedStatement ps = miConexion.prepareStatement(ConstantesSQL.OBTENER_EQUIPO_POR_ID);
			ps.setInt(1, id);
			ResultSet rs =	ps.executeQuery();
			if(rs.next()) {
				equipo.setNombre_jugador(rs.getString("nombre_jugador"));
				equipo.setNombre_equipo(rs.getString("nombre_equipo"));
				equipo.setFecha(rs.getString("fecha"));
				equipo.setLegendarios(rs.getString("legendarios"));
				equipo.setPok1(rs.getString("pok1"));
				equipo.setPok2(rs.getString("pok2"));
				equipo.setPok3(rs.getString("pok3"));
				equipo.setId(id);
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("la sql de obtener equipo por id esta mal");
			System.out.println(e.getMessage());
		}
		
		desconectar();
		
		return equipo;
	}

	@Override
	public void guardarCambiosEquipo(Equipo equipo) {

		conectar();
		
		try {

			PreparedStatement ps = miConexion.prepareStatement(ConstantesSQL.GUARDAR_CAMBIOS_EQUIPO);
			ps.setString(1, equipo.getNombre_jugador());
			ps.setString(2, equipo.getNombre_equipo());
			ps.setString(3, equipo.getFecha());
			ps.setString(4, equipo.getLegendarios());
			ps.setString(5, equipo.getPok1());
			ps.setString(6, equipo.getPok2());
			ps.setString(7, equipo.getPok3());
			ps.setInt(8, equipo.getId());
			ps.execute();
			ps.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("fallo en la sql de guardar cambios equipo");
			System.out.println(e.getMessage());
		}
		
		
		desconectar();
		
	}

}
