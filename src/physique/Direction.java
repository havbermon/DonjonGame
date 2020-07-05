package physique;

import java.util.Random;

public class Direction {
    public final int HAUT = 0; //Constants
    public final int BAS = 1;
    public final int GAUCHE = 2;
    public final int DROITE = 3;
    public Random random = new Random();

    //Thor --> forward / Thor --> backward
    //Thor --> right / Thor --> left
    public int directionOpposee(int direction) { // 0 1 2 3
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

    //Convert Direction --> Position
    public Position directionAPosition(int direction) {
        switch (direction) {
            case HAUT : // HAUT --> { -1, 0 }
                return new Position(-1, 0);
            case BAS : // BAS --> { 1, 0 }
                return new Position(1, 0);
            case GAUCHE : // GAUCHE --> { 0, -1 }
                return new Position(0, -1);
            case DROITE : // DROITE --> { 0, 1 }
                return new Position(0, 1);
            default:
                return new Position(0, 0);
        }
    }

    public int positionADirection(Position pos) {

        // HAUT --> { -1, 0 } // { -1, 0 } --> HAUT
        if(pos.getI() == -1 && pos.getJ() == 0)  return HAUT;
        if(pos.getI() == 1 && pos.getJ() == 0) return BAS;
        if(pos.getI() == 0 && pos.getJ() == -1) return GAUCHE;
        if(pos.getI() == 0 && pos.getJ() == 1) return DROITE;

        return -1;
    }

    public int obtenirDirAlea() {
        return random.nextInt(4); //limit
        // 0 -> HAUT
        // 1 -> BAS
        // 2 -> GAUCHE
        // 3 -> DROITE
    }
}
