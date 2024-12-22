package abstractas.ejercicio8;

public abstract class Producto {
	
	protected String nombre;
	protected double precioBase;
	
	 public Producto(String nom, double preBas) {
	        this.nombre = nom;
	        this.precioBase = preBas;
	    }
	 
	public Producto() {
		
	}
	
	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double preBas) {
		this.precioBase = preBas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nom) {
		this.nombre = nom;
	}

	public abstract void calcularPrecioFinal();
}
