package interfaces.ejercicio3;


public class Bicicleta implements Vehiculo {
  
	private String tipo;

    public Bicicleta(String tip) {
        this.tipo = tip;
    }


	@Override
    public void acelerar() {
        System.out.println("La bicicleta de " + tipo + " está acelerando.");
    }

    @Override
    public void frenar() {
        System.out.println("La bicicleta de " + tipo + " está frenando.");
    }
}

