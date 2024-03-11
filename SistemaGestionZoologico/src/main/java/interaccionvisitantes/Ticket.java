package interaccionvisitantes;

import java.util.Date;

public class Ticket {
    private int numero;
    private Date fechaCompra;
    private double precio;

    public Ticket(int numero, Date fechaCompra, double precio) {
        this.numero = numero;
        this.fechaCompra = fechaCompra;
        this.precio = precio;
    }

    public void mostrarDetalles() {
        System.out.println("Número de ticket: " + numero);
        System.out.println("Fecha de compra: " + fechaCompra);
        System.out.println("Precio: " + precio);
    }
}