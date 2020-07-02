package physique;

public class Position {
    private int i;
    private int j;

    public Position(int i, int j) {
        this.i = i;
        this.j = j;
    }

    public Position(Position pos) {
        this.i = pos.getI();
        this.j = pos.getJ();
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }

    public boolean equals(Position pos) {
        if(pos == null) {
            return false;
        }

        return this.i == pos.getI() && this.j == pos.getJ();
    }

    public Position clone() {
        return new Position(this);
    }

    public void additionnerPos(Position pos) {
        this.i = this.i + pos.getI();
        this.j = this.j + pos.getJ();
    }

    public void soustrairePos(Position pos) {
        this.i = this.i - pos.getI();
        this.j = this.j - pos.getJ();
    }

    public void multiplierPos(Position pos) {
        this.i = this.i * pos.getI();
        this.j = this.j * pos.getJ();
    }

}
