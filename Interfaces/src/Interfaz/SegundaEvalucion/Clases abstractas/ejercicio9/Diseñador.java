package abstractas.ejercicio9;

public class Diseñador extends Trabajador {
    public int getProyectosCompletados() {
		return proyectosCompletados;
	}

	public void setProyectosCompletados(int proyecComple) {
		this.proyectosCompletados = proyecComple;
	}

	public double getPagoPorProyecto() {
		return pagoPorProyecto;
	}

	public void setPagoPorProyecto(double pagoPorProyec) {
		this.pagoPorProyecto = pagoPorProyec;
	}

	private int proyectosCompletados;
    private double pagoPorProyecto;

    public Diseñador(String nom, int proyecCompleta, double pagoPorProyec) {
        super(nom);
        this.proyectosCompletados = proyecCompleta;
        this.pagoPorProyecto = pagoPorProyec;
    }

    @Override
    public void trabajar() {
        System.out.println(nombre + " está diseñando gráficos y elementos visuales.");
    }

    @Override
    public double calcularPago() {
        return proyectosCompletados * pagoPorProyecto;
    }
}
