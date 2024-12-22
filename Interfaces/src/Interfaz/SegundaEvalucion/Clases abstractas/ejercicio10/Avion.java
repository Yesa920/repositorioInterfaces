package abstractas.ejercicio10;

public class Avion extends Transporte {

    public Avion(String nom) {
        super(nom);
    }

    @Override
    public void desplazarse() {
        System.out.println("El " + nombre + " vuela por el aire.");
    }
}
