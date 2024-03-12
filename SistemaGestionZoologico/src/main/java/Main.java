import java.util.Scanner;
import cuidadoanimales.*;
import gestionhabitat.*;
import interaccionvisitantes.*;
import administracionrecursos.*;
import mantenimientoseguridad.*;

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

    private static void mostrarMensajeBienvenida() {
        System.out.println("Bienvenido al Zoológico Inteligente");
        System.out.println("¿Eres visitante o trabajador?");
        System.out.println("1. Visitante");
        System.out.println("2. Trabajador");
    }

    private static int seleccionarTipoUsuario(Scanner scanner) {
        System.out.print("Seleccione una opción: ");
        return scanner.nextInt();
    }

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

    private static void mostrarMenuVisitante() {
        System.out.println("\nOpciones disponibles para visitantes:");
        System.out.println("1. Ver información sobre los animales");
        System.out.println("2. Participar en un tour virtual");
        System.out.println("3. Comprar souvenirs");
        System.out.println("4. Salir");
        System.out.print("Seleccione una opción: ");
    }

    private static void mostrarInformacionAnimales() {
        System.out.println("Mostrando información sobre los animales...");
        // Aquí puedes usar las clases relacionadas con el cuidado de los animales
        Animal animal = new Animal("Tigre") {
            @Override
            public void alimentar() {
                System.out.println("Alimentando al tigre...");
                // Código para alimentar al tigre
            }

            @Override
            public void salud() {
                System.out.println("Revisando la salud del tigre...");
                // Código para revisar la salud del tigre
            }

            @Override
            public void comportamiento() {
                System.out.println("Observando el comportamiento del tigre...");
                // Código para observar el comportamiento del tigre
            }
        };

        animal.mostrarInformacion();
    }

    private static void participarTourVirtual() {
        System.out.println("Iniciando tour virtual...");
        // Aquí puedes usar las clases relacionadas con la interacción de los visitantes
        InterfazVisitante tourVirtual = new TourVirtual();
        tourVirtual.iniciar();
    }

    private static void comprarSouvenirs() {
        System.out.println("Abriendo tienda de souvenirs...");
        // Aquí puedes usar las clases relacionadas con la interacción de los visitantes
        TiendaSouvenirs tienda = new TiendaSouvenirs();
        tienda.mostrarProductos();
    }

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
                    realizarMantenimientoSeguridad();
                    break;
                case 5:
                    salir = true;
                    System.out.println("Saliendo del modo trabajador.");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
            }
        } while (!salir);
    }

    private static void mostrarMenuTrabajador() {
        System.out.println("\nOpciones disponibles para trabajadores:");
        System.out.println("1. Registrar alimentación de los animales");
        System.out.println("2. Realizar mantenimiento de hábitats");
        System.out.println("3. Administrar recursos del zoológico");
        System.out.println("4. Realizar mantenimiento y seguridad");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opción: ");
    }

    private static void registrarAlimentacionAnimales() {
        System.out.println("Registrando alimentación de los animales...");
        // Aquí puedes usar las clases relacionadas con el cuidado de los animales
        Alimento alimento = new Alimento("Carne", 100);
        alimento.registrarAlimentacion();
    }

    private static void realizarMantenimientoHabitats() {
        System.out.println("Realizando mantenimiento de hábitats...");
        // Aquí puedes usar las clases relacionadas con la gestión de hábitats
        HabitatAcuatico acuario = new HabitatAcuatico("Acuario");
        acuario.realizarMantenimiento();
    }

    private static void administrarRecursosZoo() {
        System.out.println("Administrar recursos del zoológico...");
        // Aquí puedes usar las clases relacionadas con la administración de recursos del zoológico
        Recurso recurso = new Recurso("Agua", 100) {
            @Override
            public void gestionar() {

            }
        };
        recurso.administrar();
    }

    private static void realizarMantenimientoSeguridad() {
        System.out.println("Realizando mantenimiento y seguridad...");
// Aquí puedes usar las clases relacionadas con el mantenimiento y seguridad del zoológico
        Mantenimiento mantenimiento = new Mantenimiento();
        mantenimiento.realizarMantenimiento();
        Seguridad seguridad = new Seguridad();
        seguridad.realizarSeguridad();
    }
}