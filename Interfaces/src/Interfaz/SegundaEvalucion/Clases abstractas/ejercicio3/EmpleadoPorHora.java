package abstractas.ejercicio3;

public class EmpleadoPorHora extends Empleado {
    private int horasTrabajadas;
    private double tarifaPorHora;

    public EmpleadoPorHora(String nom, int horTraba, double tarPorHor) {
        super(nom); 
        this.horasTrabajadas = horTraba;
        this.tarifaPorHora = tarPorHor;
    }

   
    @Override
    public double calcularSalario() {
        return horasTrabajadas * tarifaPorHora;
    }
}