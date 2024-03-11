package gestionhabitat;

public class Reserva {
    private String nombre;
    private int capacidad;

    public Reserva(String nombre, int capacidad) {
        this.nombre = nombre;
        this.capacidad = capacidad;
    }

    public void mostrarInformacion() {
        System.out.println("Reserva: " + nombre);
        System.out.println("Capacidad: " + capacidad + " personas");
    }

    public void reservarVisita() {
        System.out.println("Reservando visita a " + nombre);
    }

    public void cancelarReserva() {
        System.out.println("Cancelando reserva en " + nombre);
    }
}