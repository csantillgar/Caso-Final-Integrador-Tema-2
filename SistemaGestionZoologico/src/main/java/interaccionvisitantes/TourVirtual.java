package interaccionvisitantes;

public class TourVirtual implements InterfazVisitante {
    public static void iniciarTour() {
    }

    @Override
    public void proporcionarInformacion() {
        System.out.println("Proporcionando información sobre el zoológico...");
    }

    @Override
    public void ofrecerTour() {
        System.out.println("Ofreciendo tour virtual...");
    }

    @Override
    public void iniciar() {

    }
}