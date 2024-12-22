package abstractas.ejercicio9;

public class Gerente extends Trabajador {
    public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salBas) {
		this.salarioBase = salBas;
	}

	public double getBono() {
		return bono;
	}

	public void setBono(double bon) {
		this.bono = bon;
	}

	private double salarioBase;
    private double bono;

    public Gerente(String nom, double salBas, double bon) {
        super(nom);
        this.salarioBase = salBas;
        this.bono = bon;
    }

    @Override
    public void trabajar() {
        System.out.println(nombre + " está gestionando equipos y proyectos.");
    }

    @Override
    public double calcularPago() {
        return salarioBase + bono;
    }

}
