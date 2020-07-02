import physique.Position;

public class Program {
    public static void main(String[] args) {
        Position p1 = new Position(3, 4);// endereco 001
        Position p2 = new Position(p1);       // endereco 002
        Position p3 = p1.clone();             // endereco 003

        System.out.println(p1.getI()); // 3
        System.out.println(p2.getI()); // 3
        System.out.println(p3.getI()); // 3
    }
}
