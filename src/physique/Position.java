package physique;

public class Position {
    private int i; // {1,0}
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

    public void additionnerPos(Position pos) { //(3,6) -> Thor / (3,8) -> Light
        this.i = this.i + pos.getI();
        this.j = this.j + pos.getJ();
    }
    //additionnerPos(pos(3,7)); --> increase j + 1
    //additionnerPos(pos(3,8)); --> increase j + 1

    public void soustrairePos(Position pos) { //(3,6) -> Thor / (2,3) -> Light
        this.i = this.i - pos.getI();
        this.j = this.j - pos.getJ();
    }
    //soustrairePos(pos(2,5)); --> decrease
    //soustrairePos(pos(2,4)); --> decrease
    //soustrairePos(pos(2,3)); --> decrease

    public void multiplierPos(Position pos) {
        this.i = this.i * pos.getI();
        this.j = this.j * pos.getJ();
    }
}
