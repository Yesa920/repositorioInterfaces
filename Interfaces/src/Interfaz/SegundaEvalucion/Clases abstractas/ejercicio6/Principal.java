package abstractas.ejercicio6;

public class Principal {
	public static void main (String [] args) {
		Instrumento guita = new Guitarra();
		Instrumento piano = new Piano();
        Instrumento flauta = new Flauta();

   
        guita.afinar();
        guita.tocar();

        piano.afinar();
        piano.tocar();

        flauta.afinar();
        flauta.tocar();
	}
}
