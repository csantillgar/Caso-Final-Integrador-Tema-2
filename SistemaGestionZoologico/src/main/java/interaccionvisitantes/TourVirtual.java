package interaccionvisitantes;

public class TourVirtual implements InterfazVisitante {
    @Override
    public void proporcionarInformacion() {
        System.out.println("Proporcionando información sobre el zoológico...");
    }

    @Override
    public void ofrecerTour() {
        System.out.println("Ofreciendo tour virtual...");
    }
}