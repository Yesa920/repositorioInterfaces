package FantasyFutbol;

public class Jugador {

	public String nombre;
	public String posicion;
	public double precio;

	public Jugador() {

	}

	public Jugador(String nombre, String posicion, double precio) {
		super();
		this.nombre = nombre;
		this.posicion = posicion;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", posicion=" + posicion + ", precio=" + precio + "]";
	}

}