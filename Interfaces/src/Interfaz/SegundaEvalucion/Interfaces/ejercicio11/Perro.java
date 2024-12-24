package interfaces.ejercicio11;

public class Perro implements Mascota {

    
    @Override
    public void emitirSonido() {
        System.out.println("El perro dice: ¡Guau!");
    }

    @Override
    public void jugar() {
        System.out.println("El perro está jugando.");
    }
}
