package animales;

public class Animal {
    private String nombre;
    private int edad;
    private double peso;
    private double salud;

    public Animal(String nombre, int edad, double peso, double salud) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.salud = salud;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getSalud() {
        return salud;
    }

    public void setSalud(double salud) {
        this.salud = salud;
    }

    public void comer() {
        // Lógica para que el animal coma
        this.salud += 10;
    }

    public void dormir() {
        // Lógica para que el animal duerma
        this.salud += 5;
    }

    public void jugar() {
        // Lógica para que el animal juegue
        this.salud -= 5;
    }
}