package interaccionvisitantes;

public class Ventas {
    public void venderEntrada(double precio) {
        Entrada entrada = new Entrada(precio);
        entrada.comprarEntrada();
    }

    public void ofrecerSouvenirs() {
        System.out.println("Ofreciendo souvenirs a los visitantes.");
    }
}