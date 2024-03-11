package administracionrecursos;

public class Medicina extends Recurso {
    public Medicina(String nombre, int cantidadDisponible) {
        super(nombre, cantidadDisponible);
    }

    @Override
    public void gestionar() {
        System.out.println("Gestionando la medicina: " + getNombre());
    }
}