package gestionhabitat;

public abstract class Habitat {
    private String nombre;
    private double temperatura;
    private double humedad;
    private boolean limpio;

    public Habitat(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public double getHumedad() {
        return humedad;
    }

    public void setHumedad(double humedad) {
        this.humedad = humedad;
    }

    public boolean isLimpio() {
        return limpio;
    }

    public void setLimpio(boolean limpio) {
        this.limpio = limpio;
    }

    public abstract void monitorear();

    public void realizarMantenimiento() {
    }
}
