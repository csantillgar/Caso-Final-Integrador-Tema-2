package habitats;
public class HabitatsAcuatico extends Habitats {
    private double profundidad;

    public HabitatsAcuatico(String identificador, double temperatura, double humedad, double profundidad) {
        super(identificador, temperatura, humedad);
        this.profundidad = profundidad;
    }

    public double getProfundidad() {
        return profundidad;
    }

    public void setProfundidad(double profundidad) {
        this.profundidad = profundidad;
    }

    @Override
    public void analizarCondiciones() {
        if (this.getTemperatura() < 10 || this.getTemperatura() > 30) {
            this.setLimpieza(this.getLimpieza() - 10);
        }
        if (this.getHumedad() < 60 || this.getHumedad() > 90) {
            this.setLimpieza(this.getLimpieza() - 10);
        }
        if (this.getProfundidad() < 1 || this.getProfundidad() > 10) {
            this.setLimpieza(this.getLimpieza() - 10);
        }
        if (this.getLimpieza() < 0) {
            this.setLimpieza(0);
        }
    }
}