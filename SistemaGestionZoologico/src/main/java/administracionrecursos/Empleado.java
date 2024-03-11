package administracionrecursos;

public class Empleado {
    private String nombre;
    private String cargo;
    private double salario;

    public Empleado(String nombre, String cargo, double salario) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = salario;
    }

    public void realizarTarea(String tarea) {
        System.out.println(cargo + " " + nombre + " realizando " + tarea);
    }

    public void recibirPago() {
        System.out.println("Se ha pagado el salario de " + nombre);
    }
}
