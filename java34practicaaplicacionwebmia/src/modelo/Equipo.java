package modelo;

public class Equipo {

	private int id;
	private String nombre_jugador;
	private String nombre_equipo;
	private String fecha;
	private String legendarios;
	private String pok1;
	private String pok2;
	private String pok3;
	
	public Equipo() {
		
	}
	
	
	public Equipo(String nombre_jugador, String nombre_equipo, String fecha, String legendarios, String pok1,
			String pok2, String pok3) {
		super();
//		this.id = id;
		this.nombre_jugador = nombre_jugador;
		this.nombre_equipo = nombre_equipo;
		this.fecha = fecha;
		this.legendarios = legendarios;
		this.pok1 = pok1;
		this.pok2 = pok2;
		this.pok3 = pok3;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNombre_jugador() {
		return nombre_jugador;
	}


	public void setNombre_jugador(String nombre_jugador) {
		this.nombre_jugador = nombre_jugador;
	}


	public String getNombre_equipo() {
		return nombre_equipo;
	}


	public void setNombre_equipo(String nombre_equipo) {
		this.nombre_equipo = nombre_equipo;
	}


	public String getFecha() {
		return fecha;
	}


	public void setFecha(String fecha) {
		this.fecha = fecha;
	}


	public String getLegendarios() {
		return legendarios;
	}


	public void setLegendarios(String legendarios) {
		this.legendarios = legendarios;
	}


	public String getPok1() {
		return pok1;
	}


	public void setPok1(String pok1) {
		this.pok1 = pok1;
	}


	public String getPok2() {
		return pok2;
	}


	public void setPok2(String pok2) {
		this.pok2 = pok2;
	}


	public String getPok3() {
		return pok3;
	}


	public void setPok3(String pok3) {
		this.pok3 = pok3;
	}


	@Override
	public String toString() {
		return "Equipo [id=" + id + ", nombre_jugador=" + nombre_jugador + ", nombre_equipo=" + nombre_equipo
				+ ", fecha=" + fecha + ", legendarios=" + legendarios + ", pok1=" + pok1 + ", pok2=" + pok2 + ", pok3="
				+ pok3 + "]";
	}
	
	
	
	
	
	
}
