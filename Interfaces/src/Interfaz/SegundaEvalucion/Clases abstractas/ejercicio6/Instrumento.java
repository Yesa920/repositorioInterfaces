package abstractas.ejercicio6;

public abstract class Instrumento {
	
	
	
	public Instrumento() {
		
	}
	
	public abstract void tocar();
	
	public void afinar() {
		System.out.println("El instrumento se ha afinado");
	}
	
}
