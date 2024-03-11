package interaccionvisitantes;

public class Quiosco implements InterfazVisitante {
    @Override
    public void proporcionarInformacion() {
        System.out.println("Proporcionando información en el quiosco...");
    }

    @Override
    public void ofrecerTour() {
        System.out.println("Ofreciendo información detallada y tours guiados en el quiosco...");
    }
}
