package abstractas.ejercicio4;

public class Triangulo extends Figura{
	private double lado1;
    private double lado2;
    private double lado3;
    private double base;
    private double altura;
    
    public Triangulo(double lad1, double lad2, double lad3, double bas, double alt) {
        this.lado1 = lad1;
        this.lado2 = lad2;
        this.lado3 = lad3;
        this.base= bas;
        this.altura = alt;
    }

    public double getLado1() {
		return lado1;
	}

	public void setLado1(double lad1) {
		this.lado1 = lad1;
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lad2) {
		this.lado2 = lad2;
	}

	public double getLado3() {
		return lado3;
	}

	public void setLado3(double lad3) {
		this.lado3 = lad3;
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

	public void setAltura(double alt) {
		this.altura = alt;
	}

	@Override
    public double calcularArea() {
        return (base * altura)/2;
    }

    @Override
    public int calcularPerimetro() {
        return (int) (lado1 + lado2 + lado3);
    }
}
