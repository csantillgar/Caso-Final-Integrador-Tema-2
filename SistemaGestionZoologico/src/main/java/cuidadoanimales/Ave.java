package cuidadoanimales;

public class Ave extends Animal {
    public Ave(String nombre, String especie, int edad) {
        super(nombre, especie, edad);
    }

    @Override
    public void alimentar() {
        System.out.println("Alimentando ave: " + getNombre());
    }

    @Override
    public void salud() {
        System.out.println("Revisando salud de ave: " + getNombre());
    }

    @Override
    public void comportamiento() {
        System.out.println("Observando comportamiento de ave: " + getNombre());
    }

    public void mostrarInformacion() {
    }
}
