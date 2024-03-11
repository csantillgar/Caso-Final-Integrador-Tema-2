package gestionhabitat;

public class HabitatTerrestre extends Habitat {
    private boolean vegetacion;

    public HabitatTerrestre(String nombre) {
        super(nombre);
    }

    public boolean isVegetacion() {
        return vegetacion;
    }

    public void setVegetacion(boolean vegetacion) {
        this.vegetacion = vegetacion;
    }

    @Override
    public void monitorear() {
        System.out.println("Monitoreando hábitat terrestre: " + getNombre());
    }
}
