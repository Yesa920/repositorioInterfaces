package abstractas.ejercicio4;

public class Circulo extends Figura{


	private double radio;
	
	public Circulo() {
		
	}

    public Circulo(double rad) {
        this.radio = rad;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public int calcularPerimetro() {
        return (int) (2 * Math.PI * radio);
    }

	public double getRadio() {
		return radio;
	}

	public void setRadio(double rad) {
		this.radio = rad;
	}
}
