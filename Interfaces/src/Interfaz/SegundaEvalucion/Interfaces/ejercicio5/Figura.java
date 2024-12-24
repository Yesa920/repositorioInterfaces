package interfaces.ejercicio5;

public interface Figura {
	
	public abstract double calcularArea();
	
	public default void mostrarArea() {
		 System.out.println("El área es: " + calcularArea());
	};
	
}
