package interfaz.visitantes;


public abstract class TourVirtuals implements Visitable {


    private String name;

    public TourVirtuals(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void accept(Visitable visitor) {
        visitor.visit(this);
    }
}