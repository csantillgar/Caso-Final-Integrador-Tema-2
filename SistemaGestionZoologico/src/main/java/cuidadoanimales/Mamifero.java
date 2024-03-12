package cuidadoanimales;

public class Mamifero extends Animal {
    public Mamifero(String nombre, String especie, int edad) {
        super(nombre);
    }

    @Override
    public void alimentar() {
        System.out.println("Alimentando mamífero: " + getNombre());
    }

    @Override
    public void salud() {
        System.out.println("Revisando salud de mamífero: " + getNombre());
    }

    @Override
    public void comportamiento() {
        System.out.println("Observando comportamiento de mamífero: " + getNombre());
    }
}
