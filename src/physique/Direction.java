package physique;

public class Direction {
    public final int HAUT = 0;
    public final int BAS = 1;
    public final int GAUCHE = 2;
    public final int DROITE = 3;
    public int random;

    public void directionOpposee() {

    }

    public Position directionAPosition(int direction) {
        Position pos = new Position(0, 0);
        switch (direction) {
            case 0 :
                pos.setI(-1);
                pos.setJ(0);
                break;
            case 1 :
                pos.setI(1);
                pos.setJ(0);
                break;
            case 2 :
                pos.setI(0);
                pos.setJ(-1);
                break;
            case 3 :
                pos.setI(0);
                pos.setJ(1);
                break;
        }
        return pos;
    }

    public int positionADirection(Position pos) {

        if(pos.getI() == -1 && pos.getJ() == 0)  return 0;
        if(pos.getI() == 1 && pos.getJ() == 0) return 1;
        if(pos.getI() == 0 && pos.getJ() == -1) return 2;
        if(pos.getI() == 0 && pos.getJ() == 1) return 3;

        return -1;
    }
}
