// Clase para el archivo GestionDeHabitats.java

// Clase abstracta para representar un habitat genérico
abstract class Habitat {
    protected String tipo;
    protected String ubicacion;

    // Constructor
    public Habitat(String tipo, String ubicacion) {
        this.tipo = tipo;
        this.ubicacion = ubicacion;
    }

    // Método para mostrar información del hábitat
    public void mostrarInformacion() {
        System.out.println("Tipo: " + tipo);
        System.out.println("Ubicación: " + ubicacion);
    }

    // Método abstracto para monitorear el hábitat
    public abstract void monitorear();
}

// Clase para representar un habitat acuático
class Acuatico extends Habitat {
    public Acuatico(String tipo, String ubicacion) {
        super(tipo, ubicacion);
    }

    @Override
    public void monitorear() {
        System.out.println("Monitoreando condiciones del hábitat acuático...");
        // Lógica específica de monitoreo para el hábitat acuático
    }
}

// Clase para representar un habitat terrestre
class Terrestre extends Habitat {
    public Terrestre(String tipo, String ubicacion) {
        super(tipo, ubicacion);
    }

    @Override
    public void monitorear() {
        System.out.println("Monitoreando condiciones del hábitat terrestre...");
        // Lógica específica de monitoreo para el hábitat terrestre
    }
}

// Clase para representar un aviario
class Aviario extends Habitat {
    public Aviario(String tipo, String ubicacion) {
        super(tipo, ubicacion);
    }

    @Override
    public void monitorear() {
        System.out.println("Monitoreando condiciones del aviario...");
        // Lógica específica de monitoreo para el aviario
    }
}
