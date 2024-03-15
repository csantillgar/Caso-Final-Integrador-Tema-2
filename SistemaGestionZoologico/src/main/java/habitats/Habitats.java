package habitats;

public abstract class Habitats {
    private String identificador;
    private double temperatura;
    private double humedad;
    private double limpieza;

    public Habitats(String identificador, double temperatura, double humedad, double limpieza) {
        this.identificador = identificador;
        this.temperatura = temperatura;
        this.humedad = humedad;
        this.limpieza = limpieza;
    }

    public Habitats(String identificador, double temperatura, double humedad) {
    }

    protected Habitats() {
    }
    public void realizarLimpieza() {
        // Implementación predeterminada del método de limpieza
        System.out.println("Realizando limpieza en el hábitat...");
    }
    public void realizarReparaciones() {

        System.out.println("Realizando reparaciones en el hábitat...");
    }
    public void realizarRenovaciones() {

        System.out.println("Realizando renovaciones en el hábitat...");
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public int getTemperatura() {
        return (int) temperatura;
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

    public String getNombre() {
        return String.valueOf(0);
    }
}