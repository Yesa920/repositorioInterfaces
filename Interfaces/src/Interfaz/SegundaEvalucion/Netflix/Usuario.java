package Netflix;

import java.util.List;

public class Usuario {
	private String nombre;
	private String contrasegna;
	private String plan;
	private String fecha_alt;
	private String metodo_pago;
	private String direccion;
	private String pais;
	private String rol;
	private List<Serie> serie;
	private List<Pelicula> pelicula;
	private List<Juego> juego;

	public Usuario(String nom, String contra, String pla, String fec_alt, String met_pa, String direc, String pa,
			String r) {
		this.nombre = nom;
		this.contrasegna = contra;
		this.plan = pla;
		this.fecha_alt = fec_alt;
		this.metodo_pago = met_pa;
		this.direccion = direc;
		this.pais = pa;
		this.rol = r;

	}

	public Usuario() {

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nom) {
		this.nombre = nom;
	}

	public String getContrasegna() {
		return contrasegna;
	}

	public void setContrasegna(String contra) {
		this.contrasegna = contra;
	}

	public String getPlan() {
		return plan;
	}

	public void setPlan(String pla) {
		this.plan = pla;
	}

	public String getFecha_alt() {
		return fecha_alt;
	}

	public void setFecha_alt(String fec_alt) {
		this.fecha_alt = fec_alt;
	}

	public String getMetodo_pago() {
		return metodo_pago;
	}

	public void setMetodo_pago(String met_pa) {
		this.metodo_pago = met_pa;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direc) {
		this.direccion = direc;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pa) {
		this.pais = pa;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String r) {
		this.rol = r;
	}

	public void consultarPeli() {
		for (Pelicula p : pelicula) {
			System.out.println("Informacion de la pelicula");

		}
	}

}
