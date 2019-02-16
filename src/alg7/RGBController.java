package alg7;

public class RGBController {
    public RGB setColor(int r, int g, int b){
        RGB c1 = new RGB(r, g, b);
        return c1;
    }
    public RGB addColors(RGB c1, RGB c2){
        RGB c_new = new RGB(
                (c1.getR()+c2.getR())/2,
                (c1.getG()+c2.getG())/2,
                (c1.getB()+c2.getB())/2);
        return c_new;
    }
}
