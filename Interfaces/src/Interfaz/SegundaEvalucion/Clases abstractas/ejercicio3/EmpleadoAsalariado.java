package abstractas.ejercicio3;

public class EmpleadoAsalariado extends Empleado {
    private double salarioFijo;

  
    public EmpleadoAsalariado(String nombre, double salaFijo) {
        super(nombre);
        this.salarioFijo = salaFijo;
    }

   
    @Override
    public double calcularSalario() {
        return salarioFijo;
    }
}

