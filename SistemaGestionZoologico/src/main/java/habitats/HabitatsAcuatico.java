package habitats; // Asegúrate de definir el paquete correcto si es necesario

public class HabitatsAcuatico {
    private String nombre;
    private int capacidad;
    private int temperatura;
    private int nivelAgua;
    private String descripcion;

    public HabitatsAcuatico(String nombre, int capacidad, int temperatura, int nivelAgua, String descripcion) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.temperatura = temperatura;
        this.nivelAgua = nivelAgua;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public int getNivelAgua() {
        return nivelAgua;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public void setNivelAgua(int nivelAgua) {
        this.nivelAgua = nivelAgua;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}

