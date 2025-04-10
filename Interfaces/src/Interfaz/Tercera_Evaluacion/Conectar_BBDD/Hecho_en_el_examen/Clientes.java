package ExamenProgramacion;

public class Clientes {
	private int id;
	private String nombre;
	private String email;
	private String fecha_registro;

	public Clientes() {

	}

	public Clientes(int id, String nom, String ema, String fecha_regis) {
		super();
		this.id = id;
		this.nombre = nom;
		this.email = ema;
		this.fecha_registro = fecha_regis;
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

	public void setNombre(String nom) {
		this.nombre = nom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String ema) {
		this.email = ema;
	}

	public String getFecha_registro() {
		return fecha_registro;
	}

	public void setFecha_registro(String fecha_regis) {
		this.fecha_registro = fecha_regis;
	}

	@Override
	public String toString() {
		return "Clientes [id=" + id + ", nombre=" + nombre + ", email=" + email + ", fecha_registro=" + fecha_registro
				+ "]";
	}

}
