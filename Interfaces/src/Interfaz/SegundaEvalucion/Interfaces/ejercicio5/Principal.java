package interfaces.ejercicio5;

public class Principal {

	public static void main(String[] args) {
		
		Figura circulo = new Circulo(9); 
        Figura cuadrado = new Cuadrado(8,6);
		
        System.out.println("Círculo:");
        circulo.mostrarArea();

        System.out.println("Cuadrado:");
        cuadrado.mostrarArea();
        
		
	}

}
