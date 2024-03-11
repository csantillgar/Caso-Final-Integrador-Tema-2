package administracionrecursos;

public class Alimento extends Recurso {
    public Alimento(String nombre, int cantidadDisponible) {
        super(nombre, cantidadDisponible);
    }

    @Override
    public void gestionar() {
        System.out.println("Gestionando el alimento: " + getNombre());
    }
}