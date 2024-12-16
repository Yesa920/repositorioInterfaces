package interfaces.ejercicio3;


	class Coche implements Vehiculo {
	  

		private String marca;

	    public Coche(String mar) {
	        this.marca = mar;
	    }

		@Override
	    public void acelerar() {
	        System.out.println("El coche  "+ marca + " está acelerando.");
	    }

	    @Override
	    public void frenar() {
	        System.out.println("El coche "+ marca + " está frenando.");
	    }
	}

