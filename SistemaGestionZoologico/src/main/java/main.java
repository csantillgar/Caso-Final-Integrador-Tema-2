// Clase principal con el método main
public class main {
    public static void main(String[] args) {
        // Crear instancias de diferentes hábitats
        Acuatico acuatico = new Acuatico("Acuario", "Zona Acuática 1");
        Terrestre terrestre = new Terrestre("Bosque", "Zona Terrestre 1");
        Aviario aviario = new Aviario("Aviario", "Aviario 1");

        // Mostrar información de los hábitats
        acuatico.mostrarInformacion();
        terrestre.mostrarInformacion();
        aviario.mostrarInformacion();

        // Simular monitoreo de hábitats
        System.out.println("\nIniciando monitoreo de hábitats...");
        System.out.println("Registrando condiciones...\n");

        acuatico.monitorear();
        terrestre.monitorear();
        aviario.monitorear();
    }
}
