package habitats;

public abstract class Habitat {
    private String identificador;
    private double temperatura;
    private double humedad;
    private double limpieza;

    public Habitat(String identificador, double temperatura, double humedad, double limpieza) {
        this.identificador = identificador;
        this.temperatura = temperatura;
        this.humedad = humedad;
        this.limpieza = limpieza;
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