package physique;

public class Direction {
    public final int HAUT = 0;
    public final int BAS = 1;
    public final int GAUCHE = 2;
    public final int DROITE = 3;
    public int random;

    public int directionOpposee(int direction) {
        switch (direction) {
            case HAUT :
                return BAS;
            case BAS :
                return HAUT;
            case GAUCHE :
                return DROITE;
            case DROITE :
                return GAUCHE;
            default:
                return -1;
        }
    }

    public Position directionAPosition(int direction) {
        switch (direction) {
            case HAUT :
                return new Position(-1, 0);
            case BAS :
                return new Position(1, 0);
            case GAUCHE :
                return new Position(0, -1);
            case DROITE :
                return new Position(0, 1);
            default:
                return new Position(0, 0);
        }
    }

    public int positionADirection(Position pos) {

        if(pos.getI() == -1 && pos.getJ() == 0)  return HAUT;
        if(pos.getI() == 1 && pos.getJ() == 0) return BAS;
        if(pos.getI() == 0 && pos.getJ() == -1) return GAUCHE;
        if(pos.getI() == 0 && pos.getJ() == 1) return DROITE;

        return -1;
    }

    public int obtenirDirAlea() {
        return -1;
    }
}
