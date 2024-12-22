package abstractas.ejercicio10;

public class Tren extends Transporte {

    public Tren(String nom) {
        super(nom);
    }

    @Override
    public void desplazarse() {
        System.out.println("El " + nombre + " se mueve por las vías.");
    }

}
