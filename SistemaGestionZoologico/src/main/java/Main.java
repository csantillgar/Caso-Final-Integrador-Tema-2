import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        InterfazUsuario interfaz = new InterfazUsuario();

        // Mostrar índice para que el usuario elija si es trabajador o visitante
        interfaz.mostrarIndice(scanner);
        scanner.close();
    }
}

class InterfazUsuario {
    // Método que muestra el índice para que el usuario elija si es trabajador o visitante
    public void mostrarIndice(Scanner scanner) {
        System.out.println("Bienvenido al Zoo Integral");
        System.out.println("1. Ingresar como trabajador");
        System.out.println("2. Ingresar como visitante");
        System.out.println("3. Salir");

        int opcion = scanner.nextInt();
        scanner.nextLine();

        switch (opcion) {
            case 1:
                // Crear instancia de la interfaz de trabajador y ejecutarla
                InterfazTrabajador trabajador = new InterfazTrabajador();
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
                mostrarIndice(scanner);
                break;
        }
    }
}

// Paquete para la interfaz de trabajador

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
class InterfazTrabajador {
    private String nombre;
    private String apellido;
    private String cargo = "Cuidador";
    private double salario = 1000.0;


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
        mostrarOpciones();

    }

    // Método para mostrar opciones disponibles para el trabajador
    public void mostrarOpciones() {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("Bienvenido, " + nombre + ".");
            System.out.println("Seleccione una opción:");
            System.out.println("1. Registrar alimentación de animales");
            System.out.println("2. Realizar mantenimiento en hábitats");
            System.out.println("3. Ver información personal");
            System.out.println("4. Salir");
            System.out.print("Opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    registrarAlimentacion();
                    break;
                case 2:
                    realizarMantenimiento();
                    break;
                case 3:
                    mostrarInformacionPersonal();
                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                    break;
            }
        }

        scanner.close();
    }

    // Método para registrar la alimentación de animales
    private void registrarAlimentacion() {
        // Aquí puedes implementar la lógica para registrar la alimentación de animales
        System.out.println("Registrando alimentación de animales...");
    }

    // Método para realizar mantenimiento en hábitats
    private void realizarMantenimiento() {
        // Aquí puedes implementar la lógica para realizar mantenimiento en hábitats
        System.out.println("Realizando mantenimiento en hábitats...");
    }

    // Método para mostrar la información personal del trabajador
    private void mostrarInformacionPersonal() {
        System.out.println("Información personal:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salario: " + salario);
    }
}

// Paquete para la interfaz de visitante


// Clase que representa la interfaz de visitante
class InterfazVisitante {
    // Método que ejecuta la interfaz de visitante
    public void ejecutar() {
        // Implementar funcionalidades para visitantes
    }
}