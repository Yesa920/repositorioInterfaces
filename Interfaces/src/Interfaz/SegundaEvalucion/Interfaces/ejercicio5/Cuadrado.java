package interfaces.ejercicio5;

public class Cuadrado implements Figura{

	private double base;
	private double altura;
	private double resultado;
	
	public Cuadrado(double bas,double altu) {
		this.base = bas;
        this.altura = altu;
       
    }
	
	public double getBase() {
		return base;
	}

	public void setBase(double bas) {
		this.base = bas;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altu) {
		this.altura = altu;
	}

	public double getResultado() {
		return resultado;
	}

	public void setResultado(double resul) {
		this.resultado = resul;
	}

	
	
	@Override
	public double calcularArea() {
		resultado = base * altura;
		return resultado;
	}

	

}
