import administracionrecursos.*;
import cuidadoanimales.*;
import interaccionvisitantes.*;
import mantenimientoseguridad.*;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        mostrarMensajeBienvenida();
        int opcion = seleccionarTipoUsuario(scanner);

        switch (opcion) {
            case 1:
                iniciarModoVisitante(scanner);
                break;
            case 2:
                iniciarModoTrabajador(scanner);
                break;
            default:
                System.out.println("Opción inválida. Por favor, seleccione 1 o 2.");
        }
    }

    // Método para mostrar el mensaje de bienvenida
    private static void mostrarMensajeBienvenida() {
        System.out.println("Bienvenido al Zoológico Inteligente");
        System.out.println("¿Eres visitante o trabajador?");
        System.out.println("1. Visitante");
        System.out.println("2. Trabajador");
    }

    // Método para seleccionar el tipo de usuario
    private static int seleccionarTipoUsuario(Scanner scanner) {
        System.out.print("Seleccione una opción: ");
        return scanner.nextInt();
    }

    // Método para iniciar el modo visitante
    private static void iniciarModoVisitante(Scanner scanner) {
        boolean salir = false;
        do {
            mostrarMenuVisitante();
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer del scanner

            switch (opcion) {
                case 1:
                    mostrarInformacionAnimales();
                    break;
                case 2:
                    participarTourVirtual();
                    break;
                case 3:
                    comprarSouvenirs();
                    break;
                case 4:
                    salir = true;
                    System.out.println("Gracias por visitar el Zoológico Inteligente.");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
            }
        } while (!salir);
    }

    // Método para mostrar el menú de opciones para visitantes
    private static void mostrarMenuVisitante() {
        System.out.println("\nOpciones disponibles para visitantes:");
        System.out.println("1. Ver información sobre los animales");
        System.out.println("2. Participar en un tour virtual");
        System.out.println("3. Comprar souvenirs");
        System.out.println("4. Salir");
        System.out.print("Seleccione una opción: ");
    }

    // Métodos para las opciones del visitante
    private static void mostrarInformacionAnimales() {
        System.out.println("Información sobre los animales:");
        Ave ave = new Ave("Águila", "Ave rapaz", 5);
        ave.mostrarInformacion();
    }

    private static void participarTourVirtual() {
        System.out.println("Participando en el tour virtual...");
        TourVirtual.iniciarTour();
    }

    private static void comprarSouvenirs() {
        System.out.println("Bienvenido a la tienda de souvenirs:");
        TiendaSouvenirs tienda = new TiendaSouvenirs();
        tienda.mostrarProductos();
    }

    // Método para iniciar el modo trabajador
    private static void iniciarModoTrabajador(Scanner scanner) {
        boolean salir = false;
        do {
            mostrarMenuTrabajador();
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer del scanner

            switch (opcion) {
                case 1:
                    registrarAlimentacionAnimales();
                    break;
                case 2:
                    realizarMantenimientoHabitats();
                    break;
                case 3:
                    administrarRecursosZoo();
                    break;
                case 4:
                    salir = true;
                    System.out.println("Saliendo del modo trabajador.");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
            }
        } while (!salir);
    }

    // Método para mostrar el menú de opciones para trabajadores
    private static void mostrarMenuTrabajador() {
        System.out.println("\nOpciones disponibles para trabajadores:");
        System.out.println("1. Registrar alimentación de los animales");
        System.out.println("2. Realizar mantenimiento de hábitats");
        System.out.println("3. Administrar recursos del zoológico");
        System.out.println("4. Salir");
        System.out.print("Seleccione una opción: ");
    }

    // Métodos para las opciones del trabajador
    private static void registrarAlimentacionAnimales() {
        System.out.println("Registrando alimentación de los animales...");
        Comida comida = new Comida("Carne", "Alimento principal para carnívoros", 50);
        comida.registrarAlimentacion();
    }

    private static void realizarMantenimientoHabitats() {
        System.out.println("Realizando mantenimiento de hábitats...");
        Mantenimiento mantenimiento = new Mantenimiento();
        mantenimiento.realizarMantenimiento();
    }

    private static void administrarRecursosZoo() {
        System.out.println("Administrar recursos del zoológico...");
        Recurso recurso = new Recurso("Agua", "Recurso esencial para el hábitat acuático", 100) {
            @Override
            public void gestionar() {
System.out.println("Gestionando el recurso: " + getNombre());

            }
        };
        recurso.administrarRecurso();
    }
}