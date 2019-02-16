package alg8;

import static java.lang.Math.sqrt;
import static java.lang.StrictMath.pow;

public class PointsController {
    // metoda zwracająca odległośc oblicana
    // na podstawie obiektów klasy Points - klasy modelu
    public double getDistance2D(Points p1, Points p2){
        // formuła obliczania odległości 2d
        return sqrt(pow(p1.getX() - p2.getX(),2) +
                pow(p1.getY() - p2.getY(),2));
    }

    public double getDistance3D(Points p1, Points p2){
        // formuła obliczania odległości 3d
        return sqrt(pow(p1.getX() - p2.getX(),2) +
                pow(p1.getY() - p2.getY(),2) +
                pow(p1.getZ() - p2.getZ(),2));
    }
}
