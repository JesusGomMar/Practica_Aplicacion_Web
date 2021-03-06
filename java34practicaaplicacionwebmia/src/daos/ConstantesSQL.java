package daos;

public class ConstantesSQL {
	
	public static final String INSERCCION_EQUIPO = "insert into tabla_equipos(nombre_jugador, nombre_equipo, fecha, legendarios, pok1, pok2, pok3) values (?,?,?,?,?,?,?)";
	public static final String INSERCCION_JUGADOR = "insert into tabla_jugadores(nombre, calle, numeracion, cp, poblacion, telefono, email, particular_empresa	) values (?,?,?,?,?,?,?,?)";
	public static final String SELECCION_EQUIPO = "select * from tabla_equipos";
	public static final String SELECCION_JUGADOR = "select * from tabla_jugadores";
//	public static final String IDENTIFICACION_JUGADOR = "select id from tabla_jugadores where email = ? and contraseņa = ?";
	public static final String IDENTIFICACION_ADMIN = "select usuario from tabla_admin where usuario = ? and password = ? ";
	public static final String BORRADO_EQUIPO_ADMIN = "delete from tabla_equipos where id = ?";
	public static final String BORRADO_JUGADOR_ADMIN = "delete from tabla_jugadores where id = ? " ;
	public static final String OBTENER_EQUIPO_POR_ID = "select * from tabla_equipos where id = ?";
	public static final String GUARDAR_CAMBIOS_EQUIPO = "update tabla_equipos set nombre_jugador=?, nombre_equipo=?, fecha=?, legendarios=?, pok1=?, pok2=?, pok3=? where id=?";

}
