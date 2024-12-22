package abstractas.ejercicio9;

public abstract class Trabajador {
	protected String nombre;

  
    public Trabajador(String nom) {
        this.nombre = nom;
    }


    public abstract void trabajar();
    public abstract double calcularPago();

 
    public void mostrarInformacion() {
        System.out.println("Trabajador: " + nombre + " | Pago: €" + calcularPago());
    }
}
