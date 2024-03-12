// Main.java (Continuación)
/*package gestionhabitat;

import interaccionvisitantes.InterfazVisitante;
import interaccionvisitantes.TourVirtual;
import interaccionvisitantes.Quiosco;
import interaccionvisitantes.Exhibicion;
import interaccionvisitantes.Ticket;
import interaccionvisitantes.TiendaSouvenirs;
import interaccionvisitantes.Evento;
import interaccionvisitantes.Educacion;
import administracionrecursos.Recurso;
import administracionrecursos.Alimento;
import administracionrecursos.Medicina;
import administracionrecursos.Empleado;
import administracionrecursos.Donacion;
import interaccionvisitantes.Ventas;
import mantenimientoseguridad.Mantenimiento;
import mantenimientoseguridad.Seguridad;
import mantenimientoseguridad.Transporte;
import cuidadoanimales.Comida;

import java.util.Date;

public class main2 {
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

// Eventos y donaciones
Evento eventoBenefico = new Evento("Evento Benéfico", new Date(), "Recogida de fondos para la conservación de especies en peligro.");
        eventoBenefico.mostrarInformacion();

Donacion donacion = new Donacion("Empresa XYZ", 5000);
        donacion.registrarDonacion();

// Educación y reservas
Educacion charla = new Educacion("Conservación de especies", "Folleto informativo");
        charla.organizarCharla();
        charla.ofrecerRecursos();

Reserva reserva = new Reserva("Tour Nocturno", 15);
        reserva.mostrarInformacion();
        reserva.reservarVisita();
        reserva.cancelarReserva();
    }
            }
*/