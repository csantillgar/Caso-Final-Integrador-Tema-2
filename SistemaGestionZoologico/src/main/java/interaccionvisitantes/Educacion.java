package interaccionvisitantes;

public class Educacion {
    private String tema;
    private String recurso;

    public Educacion(String tema, String recurso) {
        this.tema = tema;
        this.recurso = recurso;
    }

    public void ofrecerRecursos() {
        System.out.println("Ofreciendo recursos educativos sobre " + tema + ": " + recurso);
    }

    public void organizarCharla() {
        System.out.println("Organizando charla educativa sobre " + tema);
    }
}