package habitats;

public abstract class Habitat {
    private String identificador;
    private double temperatura;
    private double humedad;
    private double limpieza;

    public Habitat(String identificador, double temperatura, double humedad) {
        this.identificador = identificador;
        this.temperatura = temperatura;
        this.humedad = humedad;
        this.limpieza = 100.0; // limpieza inicial en 100%
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
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

    public double getLimpieza() {
        return limpieza;
    }

    public void setLimpieza(double limpieza) {
        this.limpieza = limpieza;
    }

    public abstract void analizarCondiciones();
}


public class HabitatTerrestre extends Habitat {
    private boolean tieneVegetacion;

    public HabitatTerrestre(String identificador, double temperatura, double humedad, boolean tieneVegetacion) {
        super(identificador, temperatura, humedad);
        this.tieneVegetacion = tieneVegetacion;
    }

    public boolean isTieneVegetacion() {
        return tieneVegetacion;
    }

    public void setTieneVegetacion(boolean tieneVegetacion) {
        this.tieneVegetacion = tieneVegetacion;
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