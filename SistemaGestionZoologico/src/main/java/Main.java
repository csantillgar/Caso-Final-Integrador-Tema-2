// Paquete principal
package zoo;

// Clase principal que ejecuta el main
public class Main {
    public static void main(String[] args) {
        // Crear instancia de la interfaz de usuario
        InterfazUsuario interfaz = new InterfazUsuario();

        // Mostrar índice para que el usuario elija si es trabajador o visitante
        interfaz.mostrarIndice();
    }
}

// Paquete para la interfaz de usuario
package zoo.interfaz;

// Clase que representa la interfaz de usuario
public class InterfazUsuario {
    // Método que muestra el índice para que el usuario elija si es trabajador o visitante
    public void mostrarIndice() {
        System.out.println("Bienvenido al Zoo Integral");
        System.out.println("1. Ingresar como trabajador");
        System.out.println("2. Ingresar como visitante");
        System.out.println("3. Salir");

        int opcion = Integer.parseInt(System.console().readLine());

        switch (opcion) {
            case 1:
                // Crear instancia de la interfaz de trabajador y ejecutarla
                InterfazTrabajador trabajador = new InterfazTrabajador();
                trabajador.ejecutar();
                break;
            case 2:
                // Crear instancia de la interfaz de visitante y ejecutarla
                InterfazVisitante visitante = new InterfazVisitante();
                visitante.ejecutar();
                break;
            case 3:
                // Salir del programa
                System.exit(0);
                break;
            default:
                System.out.println("Opción no válida");
                mostrarIndice();
                break;
        }
    }
}

// Paquete para la interfaz de trabajador
package zoo.interfaz.trabajador;

// Clase que representa la interfaz de trabajador
public class InterfazTrabajador {
    // Método que ejecuta la interfaz de trabajador
    public void ejecutar() {
        // Implementar funcionalidades para trabajadores
    }
}

// Paquete para la interfaz de visitante
package zoo.interfaz.visitante;

// Clase que representa la interfaz de visitante
public class InterfazVisitante {
    // Método que ejecuta la interfaz de visitante
    public void ejecutar() {
        // Implementar funcionalidades para visitantes
    }
}