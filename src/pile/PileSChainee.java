package pile;

public class PileSChainee<T> {
    private Knot top;

    public void empiler(T element) {
        Knot<T> knot = new Knot<>(element);
        Knot<T> previous = top;

        top = knot;
        top.next = previous;
    }

    public void depiler() {
        top = top.next;
    }

    public T regarder() {
        return (T) top.element;
    }

    public boolean estVide() {
        return top == null;
    }
}

class Knot<T> {
    public T element;
    public Knot<T> next;

    public Knot(T value) {
        this.element = value;
    }
}



