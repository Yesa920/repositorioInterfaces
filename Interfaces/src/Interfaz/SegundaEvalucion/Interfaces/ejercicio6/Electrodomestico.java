package interfaces.ejercicio6;

public class Electrodomestico implements Producto{

	 	private String nombre;
	    private double precio;

	    public Electrodomestico(String nom, double pre) {
	        this.nombre = nom;
	        this.precio = pre;
	    }

	    @Override
	    public String obtenerNombre() {
	        return nombre;
	    }

	    @Override
	    public double obtenerPrecio() {
	        return precio;
	    }
	
}
