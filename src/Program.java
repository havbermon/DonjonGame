import physique.Direction;
import physique.Position;
import pile.PileSChainee;

public class Program {
    public static void main(String[] args) {
 /*       Position p1 = new Position(3, 4);// address 001
        Position p2 = new Position(p1);       // address 002
        Position p3 = p1.clone();             // address 003
        Position p4 = null; //not Memory address
        // 0 != null

        System.out.println(p1.getI()); // 3
        System.out.println(p2.getI()); // 3
        System.out.println(p3.getI()); // 3

        Direction dir = new Direction();

        PileSChainee pile = new PileSChainee();
        pile.empiler(1);
        pile.empiler(2);
        pile.empiler(3);
        pile.empiler(4);
        pile.empiler(5);
        pile.empiler(6);
        pile.empiler(7);
        pile.empiler(8);

        System.out.println(pile.regarder());
        pile.depiler();
        System.out.println(pile.regarder());*/

        Direction d = new Direction();
        System.out.println(d.obtenirDirAlea());
    }
}
