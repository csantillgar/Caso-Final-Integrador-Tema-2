// Paquete para la interfaz de trabajador
package zoo.interfaz.trabajador;
import java.animales.Animal;
import java.habitats.Habitat;
import java.suministros.Suministro;
public class InterfazTrabajador {
    // Método que ejecuta la interfaz de trabajador
    public void ejecutar() {
        int opcion;
        do {
            System.out.println("\n1. Registrar alimentación");
            System.out.println("2. Realizar mantenimiento de habitats");
            System.out.println("3. Administrar suministros");
            System.out.println("4. Realizar mantenimiento y seguridad");
            System.out.println("5. Salir");

            opcion = Integer.parseInt(System.console().readLine());

            switch (opcion) {
                case 1:
                    registrarAlimentacion();
                    break;
                case 2:
                    realizarMantenimientoHabitats();
                    break;
                case 3:
                    administrarSuministros();
                    break;
                case 4:
                    realizarMantenimientoSeguridad();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        } while (opcion != 5);
    }

    // Método para registrar alimentación
    private void registrarAlimentacion() {
        // Implementar funcionalidad para registrar alimentación
    }

    // Método para realizar mantenimiento de habitats
    private void realizarMantenimientoHabitats() {
        // Implementar funcionalidad para realizar mantenimiento de habitats
    }

    // Método para administrar suministros
    private void administrarSuministros() {
        // Implementar funcionalidad para administrar suministros
    }

    // Método para realizar mantenimiento y seguridad
    private void realizarMantenimientoSeguridad() {
        // Implementar funcionalidad para realizar mantenimiento y seguridad
    }
}

// Paquete para la interfaz de visitante
package zoo.interfaz.visitante;

// Clase que representa la interfaz de visitante
public class InterfazVisitante {
    // Método que ejecuta la interfaz de visitante
    public void ejecutar() {
        int opcion;
        do {
            System.out.println("\n1. Comprar entradas");
            System.out.println("2. Visualizar cualidades de animales");
            System.out.println("3. Realizar tour virtual");
            System.out.println("4. Ver tienda de souvenirs");
            System.out.println("5. Salir");

            opcion = Integer.parseInt(System.console().readLine());

            switch (opcion) {
                case 1:
                    comprarEntradas();
                    break;
                case 2:
                    visualizarCualidadesAnimales();
                    break;
                case 3:
                    realizarTourVirtual();
                    break;
                case 4:
                    verTiendaSouvenirs();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        } while (opcion != 5);
    }

    // Método para comprar entradas
    private void comprarEntradas() {
        // Implementar funcionalidad para comprar entradas
    }

    // Método para visualizar cualidades de animales
    private void visualizarCualidadesAnimales() {
        // Implementar funcionalidad para visualizar cualidades de animales
    }

    // Método para realizar tour virtual
    private void