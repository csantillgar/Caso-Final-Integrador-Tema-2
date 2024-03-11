package gestionhabitat;

public class HabitatAcuatico extends Habitat {
    private int ph;

    public HabitatAcuatico(String nombre) {
        super(nombre);
    }

    public int getPh() {
        return ph;
    }

    public void setPh(int ph) {
        this.ph = ph;
    }

    @Override
    public void monitorear() {
        System.out.println("Monitoreando hábitat acuático: " + getNombre());
    }
}
