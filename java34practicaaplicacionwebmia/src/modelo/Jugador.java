package modelo;

public class Jugador {
	
	private int id;
	private String nombre;
	private String calle;
	private String numeracion;
	private String cp;
	private String poblacion;
	private String telefono;
	private String email;
	private String particular_empresa;
	
	public Jugador() {
		
	}

	public Jugador(String nombre, String calle, String numeracion, String cp, String poblacion, String telefono,
			String email, String particular_empresa) {
		super();
		this.nombre = nombre;
		this.calle = calle;
		this.numeracion = numeracion;
		this.cp = cp;
		this.poblacion = poblacion;
		this.telefono = telefono;
		this.email = email;
		this.particular_empresa = particular_empresa;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getNumeracion() {
		return numeracion;
	}

	public void setNumeracion(String numeracion) {
		this.numeracion = numeracion;
	}

	public String getCp() {
		return cp;
	}

	public void setCp(String cp) {
		this.cp = cp;
	}

	public String getPoblacion() {
		return poblacion;
	}

	public void setPoblacion(String poblacion) {
		this.poblacion = poblacion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getParticular_empresa() {
		return particular_empresa;
	}

	public void setParticular_empresa(String particular_empresa) {
		this.particular_empresa = particular_empresa;
	}

	@Override
	public String toString() {
		return "Jugador [id=" + id + ", nombre=" + nombre + ", calle=" + calle + ", numeracion=" + numeracion + ", cp="
				+ cp + ", poblacion=" + poblacion + ", telefono=" + telefono + ", email=" + email
				+ ", particular_empresa=" + particular_empresa + "]";
	}


	
	

}
