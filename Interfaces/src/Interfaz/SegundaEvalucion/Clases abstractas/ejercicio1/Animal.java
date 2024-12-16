package Animal;

public abstract class Animal {
	/*
	 * 1. Crea una clase abstracta Animal que tenga: o Un método abstracto
	 * hacerSonido(). o Un método concreto comer() que imprima
	 * "El animal está comiendo".
	 * 
	 * 2. Crea subclases como Perro, Gato y Vaca, que implementen el método
	 * hacerSonido(). 3. En una clase principal, crea una lista de animales y
	 * recorre la lista para que todos hagan su sonido y coman.
	 */

	abstract void hacerSonido();

	public void comer() {
		System.out.println("El animal esta comiendo");
	}
}
