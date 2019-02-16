package alg9;

public class Alg9 {
    String text = "RGB color values are supported in all browsers. " +
            "An RGB color value is specified with: rgb(red, green, blue)." +
            "Each parameter (red, green, and blue) defines the intensity of the color " +
            "as an integer between 0 and 255. For example, rgb(0, 0, 255) is rendered as blue, " +
            "because the blue parameter is set to its highest value (255) and the others are set to 0.";

    public boolean contains(char c){
        for(int i = 0; i < text.length()-1; i++){
            System.out.println("iteracja: " + i);
            if(text.charAt(i) == c){
                return true;
            }
        }
        return false;
    }
    public int search(char c){
        int counter = 0;
        for(int i = 0; i < text.length()-1; i++){
            System.out.println("iteracja: " + i);
            if(text.charAt(i) == c){
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        Alg9 test = new Alg9();
        System.out.println(test.contains('c'));
        System.out.println(test.search('R'));
    }
}
