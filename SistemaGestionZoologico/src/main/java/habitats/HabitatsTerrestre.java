package habitats;

public class HabitatsTerrestre extends Habitats {
    private boolean tieneVegetacion;
    private String nombre;

    public HabitatsTerrestre(String identificador, double temperatura, double humedad, boolean tieneVegetacion, String nombre) {
        super(identificador, temperatura, humedad);
        this.tieneVegetacion = tieneVegetacion;
        this.nombre = nombre;
    }

    public boolean isTieneVegetacion() {
        return tieneVegetacion;
    }

    public void setTieneVegetacion(boolean tieneVegetacion) {
        this.tieneVegetacion = tieneVegetacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void analizarCondiciones() {
        if (this.getTemperatura() < 15 || this.getTemperatura() > 30) {
            this.setLimpieza(this.getLimpieza() - 10);
        }
        if (this.getHumedad() < 40 || this.getHumedad() > 70) {
            this.setLimpieza(this.getLimpieza() - 10);
        }
        if (this.isTieneVegetacion()) {
            this.setLimpieza(this.getLimpieza() + 5);
        }
        if (this.getLimpieza() < 0) {
            this.setLimpieza(0);
        }
    }
}
