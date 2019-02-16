package alg7;

public class Main {
    public static void main(String[] args) {
        RGBController rgb = new RGBController();
        RGB red = rgb.setColor(255,0,0);
        RGB green = rgb.setColor(0,255,0);
        System.out.println(rgb.addColors(red, green));
    }
}
