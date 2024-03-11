package interaccionvisitantes;

public class Exhibicion {
    private String nombre;
    private String descripcion;

    public Exhibicion(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public void mostrarInformacion() {
        System.out.println("Exhibición: " + nombre);
        System.out.println("Descripción: " + descripcion);
    }

    public void iniciarExhibicion() {
        System.out.println("Iniciando exhibición: " + nombre);
    }

    public void finalizarExhibicion() {
        System.out.println("Finalizando exhibición: " + nombre);
    }
}