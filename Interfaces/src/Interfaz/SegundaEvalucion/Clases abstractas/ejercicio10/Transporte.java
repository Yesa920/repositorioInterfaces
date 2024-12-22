package abstractas.ejercicio10;

public abstract class Transporte {
	 protected String nombre;


	    public Transporte(String nom) {
	        this.nombre = nom;
	    }

	
	    public abstract void desplazarse();


	    public String getNombre() {
			return nombre;
		}


		public void setNombre(String nom) {
			this.nombre = nom;
		}


		public void parar() {
	        System.out.println("El " + nombre + " se detuvo.");
	    }
}
