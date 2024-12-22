package abstractas.ejercicio10;

public class Barco extends Transporte {

    public Barco(String nom) {
        super(nom);
    }

    @Override
    public void desplazarse() {
        System.out.println("El " + nombre + " navega por el agua.");
    }

}
