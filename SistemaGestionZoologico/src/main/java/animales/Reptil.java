package animales;

public class Reptil extends Animal {
    private boolean venenoso;

    public Reptil(String nombre, int edad, double peso, double salud, boolean venenoso) {
        super(nombre, edad, peso, salud);
        this.venenoso = venenoso;
    }

    public boolean isVenenoso() {
        return venenoso;
    }

    public void setVenenoso(boolean venenoso) {
        this.venenoso = venenoso;
    }

    @Override
    public void emitirSonido() {
        System.out.println("El reptil emite un sonido característico.");
    }

    public void mudarPiel() {
        this.salud -= 10;
    }
}