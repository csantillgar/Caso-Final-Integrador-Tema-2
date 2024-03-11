package administracionrecursos;

public class Donacion {
    private String donante;
    private double cantidad;

    public Donacion(String donante, double cantidad) {
        this.donante = donante;
        this.cantidad = cantidad;
    }

    public void registrarDonacion() {
        System.out.println("Donación de " + cantidad + " recibida de " + donante);
    }
}