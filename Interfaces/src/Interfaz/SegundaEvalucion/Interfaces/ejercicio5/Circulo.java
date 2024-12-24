package interfaces.ejercicio5;

public class Circulo implements Figura{
	
	private double radio;
	private double resultado;
	
	public Circulo(double rad) {
        this.radio = rad;
    }
	
	public double getRadio() {
		return radio;
	}

	public void setRadio(double rad) {
		this.radio = rad;
	}

	public double getResultado() {
		return resultado;
	}

	public void setResultado(double resul) {
		this.resultado = resul;
	}

	@Override
	public double calcularArea() {
		resultado = Math.PI * radio * radio;
		return resultado;
	}

	
}
