package interfaz;

public class Administrador extends Trabajador {
    private String nombre;
    private String apellido;
    private String area;

    public Administrador(String nombre, String apellido, String area) {
        super(nombre, apellido, "Administrador", 0.0);
        this.nombre = nombre;
        this.apellido = apellido;
        this.area = area;
    }

    @Override
    public void trabajar() {
        System.out.println(this.nombre + " " + this.apellido + " está administrando los recursos del zoológico.");
        // Implementar lógica para administrar los recursos del zoológico
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}