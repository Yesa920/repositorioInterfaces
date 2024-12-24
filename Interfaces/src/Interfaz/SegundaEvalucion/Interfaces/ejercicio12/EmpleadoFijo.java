package interfaces.ejercicio12;

public class EmpleadoFijo implements Empleado {
    private String nombre;
    private double salarioFijo;

   
    public EmpleadoFijo(String nom, double salaFijo) {
        this.nombre = nom;
        this.salarioFijo = salaFijo;
    }

  
    @Override
    public String obtenerNombre() {
        return this.nombre;
    }

   
    @Override
    public double calcularSalario() {
        return this.salarioFijo;
    }

}
