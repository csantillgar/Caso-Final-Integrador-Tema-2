import animales.*;
import habitats.*;
import interfaz.*;
import interfaz.visitantes.*;
import suministros.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Scanner;
import interfaz.Administrador;
import interfaz.Cuidador;
import interfaz.Mantenimiento;
import interfaz.visitantes.Comprador;
import interfaz.visitantes.Espectador;
import interfaz.visitantes.Visitante;

public class Main {
    static List<Animal> listaAnimales = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Crear instancias de animales
        Animal leon = new Mamifero("León", 5, 150, 100, "Dorado", 4);
        Animal tigre = new Mamifero("Tigre", 4, 180, 95, "Rayado", 4);
        Animal loro = new Ave("Loro", 2, 1, 90, "Verde");
        Animal serpiente = new Reptil("Serpiente", 3, 5, 85, true);

        // Asignar valores a la lista de animales
        listaAnimales = new ArrayList<>();
        listaAnimales.add(leon);
        listaAnimales.add(tigre);
        listaAnimales.add(loro);
        listaAnimales.add(serpiente);

        //Crear instancias de hábitats
        List<Habitats> listaHabitats = new ArrayList<>();
        HabitatsAcuatico habitatAcuatico1 = new HabitatsAcuatico("Estanque", 20, 80, 5, "Estanque principal");
        HabitatsAcuatico habitatAcuatico2 = new HabitatsAcuatico("Lago", 22, 75, 8, "Lago central");

        HabitatsTerrestre habitatTerrestre1 = new HabitatsTerrestre("Savannah", 25, 50, true, "Savannah principal");
        HabitatsTerrestre habitatTerrestre2 = new HabitatsTerrestre("Bosque", 20, 60, true, "Bosque central");

        listaHabitats.add(habitatAcuatico1);
        listaHabitats.add(habitatAcuatico2);
        listaHabitats.add(habitatTerrestre1);
        listaHabitats.add(habitatTerrestre2);
        InterfazTrabajador trabajador = new InterfazTrabajador(listaAnimales, listaHabitats);

        // Crear instancias de suministros
        Suministro agua = new Agua(1000);
        Suministro comida = new Comida(500);



        InterfazUsuario interfaz = new InterfazUsuario();
        interfaz.mostrarIndice(scanner, listaHabitats);

        // Crear instancias de trabajadores
        Administrador administrador = new Administrador("Juan", "Pérez", "Administración");
        Cuidador cuidador1 = new Cuidador("María", "González", "Aves");
        Cuidador cuidador2 = new Cuidador("Pedro", "Sánchez", "Mamíferos");

        // Crear instancias de visitantes
        Visitante comprador = new Comprador("Ana", "Martínez", 25);
        Visitante espectador = new Espectador("Luis", "López", 30, new String[]{"León", "Tigre"});


        // Mostrar índice para que el usuario elija si es trabajador o visitante
        scanner.close();
    }
}

class InterfazUsuario {
    // Método que muestra el índice para que el usuario elija si es trabajador o visitante
    public void mostrarIndice(Scanner scanner, List<Habitats> listaHabitats) {
        System.out.println("Bienvenido al Zoo Integral");
        System.out.println("1. Ingresar como trabajador");
        System.out.println("2. Ingresar como visitante");
        System.out.println("3. Salir");

        int opcion = scanner.nextInt();
        scanner.nextLine();

        switch (opcion) {
            case 1:
                // Crear instancia de la interfaz de trabajador y ejecutarla
                InterfazTrabajador trabajador = new InterfazTrabajador(Main.listaAnimales,listaHabitats);
                trabajador.ejecutar(scanner);
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
                break;
        }
    }
}


// Clase que representa la interfaz de trabajador
class Trabajador {
    private String nombre;
    private String apellido;
    private String cargo;
    private double salario;
    private Trabajador trabajador;
    public Trabajador(String nombre, String apellido, String cargo, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cargo = cargo;
        this.salario = salario;
    }
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCargo() {
        return cargo;
    }

    public double getSalario() {
        return salario;
    }
}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
class InterfazTrabajador {
    private String nombre;
    private String apellido;
    private String cargo = "Cuidador";
    private double salario = 1000.0;
    private List<Animal> listaAnimales;
    private List<Habitats> listaHabitats;

    public InterfazTrabajador(List<Animal> listaAnimales, List<Habitats> listaHabitats) {
        this.listaAnimales = listaAnimales;
        this.listaHabitats = listaHabitats;
    }



    public void ejecutar(Scanner scanner) {

        System.out.println("Bienvenido al sistema de trabajadores");
        System.out.println("Por favor, inicie sesión:");
        System.out.print("Nombre y apellido: ");
        String nombreCompleto = scanner.nextLine();
        String[] partesNombre = nombreCompleto.split(" ");
        this.nombre = partesNombre[0];
        this.apellido = partesNombre[1];
        System.out.print("Contraseña: ");
        String contraseña = scanner.nextLine();

        // Aquí podrías agregar lógica para autenticar al usuario
        // y permitirle acceder a funcionalidades específicas del trabajador

        // Ejemplo de funcionalidad: mostrar opciones disponibles para el trabajador
        mostrarOpciones(scanner);

    }

    // Método para mostrar opciones disponibles para el trabajador
    private void mostrarOpciones(Scanner scanner) {
        boolean salir = false;

        while (!salir) {
            System.out.println("Bienvenido, " + nombre);
            System.out.println("Seleccione una opción:");
            System.out.println("1. Registrar alimentación de animales");
            System.out.println("2. Realizar mantenimiento en hábitats");
            System.out.println("3. Ver información personal");
            System.out.println("4. Comunicarse con otros trabajadores");
            System.out.println("5. Gestionar suministros");
            System.out.println("6. Salir");
            System.out.print("Opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    registrarAlimentacion(listaAnimales, scanner);
                    break;
                case 2:
                    realizarMantenimiento(listaHabitats, scanner);
                    break;
                case 3:
                    mostrarInformacionPersonal();
                    break;
                case 4:
                    comunicarseConTrabajadores();
                    break;
                case 5:
                    gestionarSuministros();
                    break;
                case 6:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                    break;
            }
        }
    }


    // Método para registrar la alimentación de animales
    private void registrarAlimentacion(List<Animal> listaAnimales, Scanner scanner) {
        System.out.println("Registrando alimentación de animales...");


        // Mostrar lista de animales
        System.out.println("Lista de animales:");
        for (int i = 0; i < listaAnimales.size(); i++) {
            System.out.println((i + 1) + ". " + listaAnimales.get(i).getNombre());
        }

        // Solicitar al usuario que elija un animal
        System.out.print("Seleccione el número correspondiente al animal para registrar la alimentación: ");
        int opcionAnimal = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea pendiente


        // Verificar si la opción es válida
        if (opcionAnimal >= 1 && opcionAnimal <= listaAnimales.size()) {
            Animal animalSeleccionado = listaAnimales.get(opcionAnimal - 1);

            // Solicitar al usuario la cantidad de alimento
            System.out.print("Ingrese la cantidad de alimento para " + animalSeleccionado.getNombre() + ": ");
            double cantidadAlimento = scanner.nextDouble();
            scanner.nextLine(); // Consumir la nueva línea pendiente

            // Actualizar la cantidad de alimento del animal utilizando el método apropiado de Animal
            animalSeleccionado.actualizarCantidadAlimento(cantidadAlimento);

            System.out.println("Alimentación registrada con éxito para " + animalSeleccionado.getNombre() + ".");
        } else {
            System.out.println("Opción no válida. Por favor, seleccione un número válido.");
        }
        }


    // Método para realizar mantenimiento en hábitats
    private void realizarMantenimiento(List<Habitats> habitats, Scanner scanner) {
        System.out.println("Realizando mantenimiento en hábitats...");

        // Mostrar la lista de hábitats disponibles
        System.out.println("Lista de hábitats:");
        for (int i = 0; i < habitats.size(); i++) {
            Habitats habitat = habitats.get(i);
            System.out.println((i + 1) + ". " + habitat.getNombre());
        }

        // Solicitar al usuario que elija un hábitat para realizar mantenimiento
        System.out.print("Seleccione el número correspondiente al hábitat para realizar mantenimiento: ");
        int opcionHabitat = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea pendiente

        // Verificar si la opción es válida
        if (opcionHabitat >= 1 && opcionHabitat <= habitats.size()) {
            Habitats habitatSeleccionado = habitats.get(opcionHabitat - 1);

            // Mostrar las acciones disponibles para el mantenimiento
            System.out.println("Seleccione la acción de mantenimiento a realizar:");
            System.out.println("1. Limpieza");
            System.out.println("2. Reparaciones");
            System.out.println("3. Renovaciones");
            System.out.print("Opción: ");
            int opcionAccion = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea pendiente

            // Realizar la acción de mantenimiento seleccionada
            switch (opcionAccion) {
                case 1:
                    habitatSeleccionado.realizarLimpieza();
                    break;
                case 2:
                    habitatSeleccionado.realizarReparaciones();
                    break;
                case 3:
                    habitatSeleccionado.realizarRenovaciones();
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }

            System.out.println("Mantenimiento realizado con éxito en el hábitat " + habitatSeleccionado.getNombre() + ".");
        } else {
            System.out.println("Opción no válida. Por favor, seleccione un número válido.");
        }
    }


    // Método para mostrar la información personal del trabajador
    private void mostrarInformacionPersonal() {
        System.out.println("Información personal:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salario: " + salario);
    }
    private void comunicarseConTrabajadores() {
        // Aquí puedes implementar la lógica para comunicarse con otros trabajadores
        System.out.println("Comunicándose con otros trabajadores...");
    }
    private void gestionarSuministros() {
        // Aquí puedes implementar la lógica para gestionar suministros
        System.out.println("Gestionando suministros...");
        }
    }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Clase que representa la interfaz de visitante
class InterfazVisitante {
    // Método que ejecuta la interfaz de visitante
    public void ejecutar() {
        Scanner scanner = new Scanner(System.in);
        // Implementar funcionalidades para visitantes
        System.out.println("Bienvenido al Zoo Integral como visitante");
        boolean salir = false;
        while (!salir) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Comprar entrada");
            System.out.println("2. Ver información de animales");
            System.out.println("3. Realizar tour virtual");
            System.out.println("4. Salir");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    comprarEntrada();
                    break;
                case 2:
                    verInformacionAnimales();
                    break;
                case 3:
                    realizarTourVirtual();
                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                    break;
            }
    }
}
    // Método para comprar la entrada
    private void comprarEntrada() {
        System.out.println("Comprando entrada...");
        // Aquí puedes implementar la lógica para comprar la entrada
    }
    // Método para ver información de los animales
    private void verInformacionAnimales() {
        System.out.println("Viendo información de los animales...");
        // Aquí puedes implementar la lógica para ver la información de los animales
    }
    private void realizarTourVirtual() {
        System.out.println("Realizando tour virtual...");
        // Aquí puedes implementar la lógica para realizar un tour virtual
    }


}