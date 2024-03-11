import cuidadoanimales.Ave;
import cuidadoanimales.Mamifero;
import gestionhabitat.HabitatAcuatico;
import gestionhabitat.HabitatTerrestre;
import interaccionvisitantes.InterfazVisitante;
import interaccionvisitantes.TourVirtual;
import interaccionvisitantes.Quiosco;
import interaccionvisitantes.Exhibicion;
import interaccionvisitantes.Ticket;
import interaccionvisitantes.TiendaSouvenirs;
import administracionrecursos.Recurso;
import administracionrecursos.Alimento;
import administracionrecursos.Medicina;
import administracionrecursos.Empleado;
import interaccionvisitantes.Ventas;
import mantenimientoseguridad.Mantenimiento;
import mantenimientoseguridad.Seguridad;
import mantenimientoseguridad.Transporte;
import cuidadoanimales.Comida;


import java.util.Date;
/*

public class Main {
    public static void main(String[] args) {
        // Ejemplo de uso
        HabitatAcuatico acuario = new HabitatAcuatico("Acuario");
        HabitatTerrestre selva = new HabitatTerrestre("Selva");

        acuario.setTemperatura(25.5);
        acuario.setHumedad(80);
        acuario.setPh(7);

        selva.setTemperatura(30);
        selva.setHumedad(70);
        selva.setVegetacion(true);

        acuario.monitorear();
        selva.monitorear();

        Mamifero leon = new Mamifero("León", "Felino", 5);
        Ave aguila = new Ave("Águila", "Rapaz", 10);

        leon.alimentar();
        leon.salud();
        leon.comportamiento();

        aguila.alimentar();
        aguila.salud();
        aguila.comportamiento();

        // Interacción con visitantes
        InterfazVisitante tourVirtual = new TourVirtual();
        InterfazVisitante quiosco = new Quiosco();

        tourVirtual.proporcionarInformacion();
        tourVirtual.ofrecerTour();

        quiosco.proporcionarInformacion();
        quiosco.ofrecerTour();

        // Exhibiciones y entradas
        Exhibicion espectaculoLeones = new Exhibicion("Espectáculo de Leones", "Increíbles acrobacias de leones.");
        espectaculoLeones.mostrarInformacion();
        espectaculoLeones.iniciarExhibicion();
        espectaculoLeones.finalizarExhibicion();

        Ticket ticket = new Ticket(123456, new Date(), 25.0);
        ticket.mostrarDetalles();

        // Administración de recursos
        Recurso alimento = new Alimento("Carne", 100);
        Recurso medicina = new Medicina("Vacuna", 50);

        alimento.gestionar();
        medicina.gestionar();

        // Gestión de empleados
        Empleado veterinario = new Empleado("Juan", "Veterinario", 2000);
        Empleado jardinero = new Empleado("Pedro", "Jardinero", 1500);

        veterinario.realizarTarea("revisión de salud");
        jardinero.realizarTarea("podar árboles");

        veterinario.recibirPago();
        jardinero.recibirPago();

        // Ventas y entradas
        Ventas ventas = new Ventas();
        ventas.venderEntrada(20);
        ventas.ofrecerSouvenirs();

        // Mantenimiento y Seguridad
        Mantenimiento mantenimiento = new Mantenimiento();
        Seguridad seguridad = new Seguridad();

        mantenimiento.programarMantenimiento();
        mantenimiento.realizarMantenimiento();

        seguridad.monitorearAccesos();
        seguridad.monitorearMovimientos();

        // Cuidado de animales
        Comida comida = new Comida("Carne", "Carnívoro");
        comida.preparar();
        comida.servir();

        // Utilización del transporte
        Transporte transporte = new Transporte("Tren", "Transporte para los visitantes.");
        transporte.usar();
        transporte.revisar();

        // Venta de souvenirs
        TiendaSouvenirs tienda = new TiendaSouvenirs();
        tienda.venderSouvenirs();
    }
}
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al Zoológico Inteligente");
        System.out.println("¿Eres visitante o trabajador?");
        System.out.println("1. Visitante");
        System.out.println("2. Trabajador");
        System.out.print("Seleccione una opción: ");

        int opcion = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer del scanner

        switch (opcion) {
            case 1:
                // Código para visitantes
                System.out.println("¡Bienvenido, visitante!");
                mostrarMenuVisitante(scanner);
                break;
            case 2:
                // Código para trabajadores
                System.out.println("¡Bienvenido, trabajador!");
                mostrarMenuTrabajador(scanner);
                break;
            default:
                System.out.println("Opción inválida. Por favor, seleccione 1 o 2.");
        }
    }

    private static void mostrarMenuVisitante(Scanner scanner) {
        boolean salir = false;
        do {
            System.out.println("\nOpciones disponibles para visitantes:");
            System.out.println("1. Ver información sobre los animales");
            System.out.println("2. Participar en un tour virtual");
            System.out.println("3. Comprar souvenirs");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer del scanner

            switch (opcion) {
                case 1:
                    // Código para ver información sobre los animales
                    System.out.println("Información sobre los animales:");
                    // Ejemplo de uso de clases previamente desarrolladas
                    Ave ave = new Ave("Águila", "Ave rapaz", 5);
                    ave.mostrarInformacion();
                    // Puedes llamar a otras clases y métodos aquí según las funcionalidades del zoológico
                    break;
                case 2:
                    // Código para participar en un tour virtual
                    System.out.println("Participando en el tour virtual...");
                    // Ejemplo de uso de clases previamente desarrolladas
                    TourVirtual.iniciarTour();
                    // Puedes llamar a otras clases y métodos aquí según las funcionalidades del zoológico
                    break;
                case 3:
                    // Código para comprar souvenirs
                    System.out.println("Bienvenido a la tienda de souvenirs:");
                    // Ejemplo de uso de clases previamente desarrolladas
                    TiendaSouvenirs tienda = new TiendaSouvenirs();
                    tienda.mostrarProductos();
                    // Puedes llamar a otras clases y métodos aquí según las funcionalidades del zoológico
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

    private static void mostrarMenuTrabajador(Scanner scanner) {
        boolean salir = false;
        do {
            System.out.println("\nOpciones disponibles para trabajadores:");
            System.out.println("1. Registrar alimentación de los animales");
            System.out.println("2. Realizar mantenimiento de hábitats");
            System.out.println("3. Administrar recursos del zoológico");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer del scanner

            switch (opcion) {
                case 1:
                    // Código para registrar alimentación de los animales
                    System.out.println("Registrando alimentación de los animales...");
                    // Ejemplo de uso de clases previamente desarrolladas
                    Comida comida = new Comida("Carne", "Alimento principal para carnívoros", 50);
                    comida.registrarAlimentacion();
                    // Puedes llamar a otras clases y métodos aquí según las funcionalidades del zoológico
                    break;
                case 2:
                    // Código para realizar mantenimiento de hábitats
                    System.out.println("Realizando mantenimiento de hábitats...");
                    // Ejemplo de uso de clases previamente desarrolladas
                    Mantenimiento mantenimiento = new Mantenimiento();
                    mantenimiento.realizarMantenimiento();
                    // Puedes llamar a otras clases y métodos aquí según las funcionalidades del zoológico
                    break;
                case 3:
                    // Código para administrar recursos del zoológico
                    System.out.println("Administrar recursos del zoológico...");
                    // Ejemplo de uso de clases previamente desarrolladas
                    Recurso recurso = new Recurso("Agua", "Recurso esencial para el hábitat acuático", 100);
                    recurso.administrarRecurso();
                    // Puedes llamar a otras clases y métodos aquí según las funcionalidades del zoológico
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
}
