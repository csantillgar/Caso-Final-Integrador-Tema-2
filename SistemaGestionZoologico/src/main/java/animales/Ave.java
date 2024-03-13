package animales;
public class Ave extends Animal {
    private String alas;

    public Ave(String nombre, int edad, double peso, double salud, String alas) {
        super(nombre, edad, peso, salud);
        this.alas = alas;
    }

    public String getAlas() {
        return alas;
    }

    public void setAlas(String alas) {
        this.alas = alas;
    }

    @Override
    public void emitirSonido() {
        System.out.println("La ave emite un sonido característico.");
    }

    public void volar() {
        this.salud -= 10;
    }
}