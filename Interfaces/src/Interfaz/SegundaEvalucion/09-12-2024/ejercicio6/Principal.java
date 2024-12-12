package SegundaEvaluacion.ejercicio6;

public class Principal {
	public static void main(String[] args) {
		Instrumento instrumento = new Instrumento();
		Guitarra guitarra = new Guitarra();
		Piano piano = new Piano();
		Bateria bateria = new Bateria();

		System.out.println("Instrumento " + instrumento.tocar());
		System.out.println("Piano " + piano.tocar());
		System.out.println("Guitarra " + guitarra.tocar());
		System.out.println("Bateria " + bateria.tocar());

	}
}
