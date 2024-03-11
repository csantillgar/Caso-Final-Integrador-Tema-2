package interaccionvisitantes;

public class Entrada {
    private double precio;

    public Entrada(double precio) {
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public void comprarEntrada() {
        System.out.println("Entrada comprada por " + precio + " dólares.");
    }
}
