package administracionrecursos;

public abstract class Recurso {
    private String nombre;
    private int cantidadDisponible;

    public Recurso(String nombre, int cantidadDisponible) {
        this.nombre = nombre;
        this.cantidadDisponible = cantidadDisponible;
    }

    public Recurso(String agua, String s, int i) {
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

    public abstract void gestionar();

    public void administrarRecurso() {
    }
}