package cuidadoanimales;

public class Comida {
    private String nombre;
    private String tipo;

    public Comida(String nombre, String tipo, int i) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public void servir() {
        System.out.println("Sirviendo comida: " + nombre);
    }

    public void preparar() {
        System.out.println("Preparando comida: " + nombre);
    }

    public void registrarAlimentacion() {
    }
}