package pile;

public class PileSChainee<T> {
    private Knot top;

    public void empiler(T element) { //add new element (Maria)
        Knot<T> knot = new Knot<>(element); //[Maria / Ref] --> Knot
        Knot<T> previous = top;

        top = knot;
        top.next = previous;
    }

    //91 - Maria [81]  --> top
    //81 - Daniel [01] --> top.next
    //01 - Kenia [92]
    //92 - Gabriel [73]
    //73 - Ana [05]
    //05 - Lucas [null] --> last

    public void depiler() { //remove an element from the stack
        top = top.next;
    }

    public T regarder() {
        return (T) top.element;
    } //see the top

    //Kenia --> top
    //Gabriel
    //Ana
    //Lucas --> last

    public boolean estVide() { //see if the stack is empty or not
        return top == null;
    }
}

class Knot<T> { // T --> generic
    public T element;
    public Knot<T> next;

    public Knot(T value) {
        this.element = value;
    }
}



