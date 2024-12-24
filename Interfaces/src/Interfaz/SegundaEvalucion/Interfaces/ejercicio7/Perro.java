package interfaces.ejercicio7;

public class Perro implements SerVivo, Mamifero{

	@Override
	
	public void respirar() {
		System.out.println("El perro repira");
	}
	
	public  void amamantar() {
		System.out.println("El perro amanta a las crias");
	}
}
