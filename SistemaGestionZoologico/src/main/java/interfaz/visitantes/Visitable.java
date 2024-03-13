package interfaz.visitantes;

public interface Visitable<T extends Visitable<T>> {

    void visit(T tour);

    void accept(Visitable<T> visitor);

}

