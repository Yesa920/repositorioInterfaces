package abstractas.ejercicio4;

public class Rectangulo extends Figura {
	 private double largo;
	    private double ancho;

	    public Rectangulo(double lar, double anc) {
	        this.largo = lar;
	        this.ancho = anc;
	    }

	    public double getLargo() {
			return largo;
		}

		public void setLargo(double lar) {
			this.largo = lar;
		}

		public double getAncho() {
			return ancho;
		}

		public void setAncho(double anc) {
			this.ancho = anc;
		}

		@Override
	    public double calcularArea() {
	        return largo * ancho;
	    }

	    @Override
	    public int calcularPerimetro() {
	        return (int) (2 * (largo + ancho));
	    }
	}
    
    


