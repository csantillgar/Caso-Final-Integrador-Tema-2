package interaccionvisitantes;

import java.util.Date;

public class Evento {
    private String nombre;
    private Date fecha;
    private String descripcion;

    public Evento(String nombre, Date fecha, String descripcion) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.descripcion = descripcion;
    }

    public void mostrarInformacion() {
        System.out.println("Evento: " + nombre);
        System.out.println("Fecha: " + fecha);
        System.out.println("Descripción: " + descripcion);
    }
}