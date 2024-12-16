package abstractas.ejercicio3;

public abstract class Empleado {
    // Atributo protegido para las subclases
    protected String nombre;

    // Constructor
    public Empleado(String nom) {
        this.nombre = nom; // Asigna el nombre recibido
    }

    // Método abstracto
    public abstract double calcularSalario();

    // Método concreto
    public void mostrarInfo() {
        System.out.println("Nombre del empleado: " + nombre);
    }
}

