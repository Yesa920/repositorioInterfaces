package interfaces.ejercicio2;

public class Principal {

	public static void main(String[] args) {
		Pato nada = new Nadador();
		Pato vola = new Volador();
		
		
		System.out.println(nada.nadar());
		System.out.println(vola.volar());
	}

}
