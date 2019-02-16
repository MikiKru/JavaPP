package alg8;

public class Main {
    public static void main(String[] args) {
        PointsController pc = new PointsController();
        // płaszczyzna
        Points p1 = new Points(2,2,0);
        Points p2 = new Points(3,3,0);
        // przestrzeń
        Points p3 = new Points(3,3,3);
        Points p4 = new Points(4,4,4);
        // obliczenia
        System.out.println(pc.getDistance2D(p1,p2));
        System.out.println(pc.getDistance3D(p3,p4));
    }
}
