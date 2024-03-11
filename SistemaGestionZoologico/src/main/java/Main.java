package gestionhabitat;

import interaccionvisitantes.InterfazVisitante;
import interaccionvisitantes.TourVirtual;
import interaccionvisitantes.Quiosco;
import administracionrecursos.Recurso;
import administracionrecursos.Alimento;
import administracionrecursos.Medicina;
import administracionrecursos.Empleado;
import interaccionvisitantes.Ventas;
import mantenimientoseguridad.Mantenimiento;
import mantenimientoseguridad.Seguridad;

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
    }
}

