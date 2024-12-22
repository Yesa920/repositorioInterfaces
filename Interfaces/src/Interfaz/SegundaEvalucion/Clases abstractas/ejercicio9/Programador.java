package abstractas.ejercicio9;

public class Programador extends Trabajador {
    public double getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public void setHorasTrabajadas(double horTraba) {
		this.horasTrabajadas = horTraba;
	}

	public double getTarifaPorHora() {
		return tarifaPorHora;
	}

	public void setTarifaPorHora(double tarPorHor) {
		this.tarifaPorHora = tarPorHor;
	}

	private double horasTrabajadas;
    private double tarifaPorHora;

    public Programador(String nom, double horTrabaja, double tarPorHor) {
        super(nom);
        this.horasTrabajadas = horTrabaja;
        this.tarifaPorHora = tarPorHor;
    }

    @Override
    public void trabajar() {
        System.out.println(nombre + " está escribiendo código.");
    }

    @Override
    public double calcularPago() {
        return horasTrabajadas * tarifaPorHora;
    }
}
