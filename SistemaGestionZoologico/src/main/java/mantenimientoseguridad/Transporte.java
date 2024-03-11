package mantenimientoseguridad;

public class Transporte {
    private String tipo;
    private String descripcion;

    public Transporte(String tipo, String descripcion) {
        this.tipo = tipo;
        this.descripcion = descripcion;
    }

    public void usar() {
        System.out.println("Utilizando transporte: " + tipo);
    }

    public void revisar() {
        System.out.println("Revisando transporte: " + tipo);
    }
}