package alg4.controller;

import static java.lang.StrictMath.pow;

public class Controller {
    public String decimalToBinary(int decimal){
        String binary ="";
        while(decimal > 0){
            binary = binary + String.valueOf(decimal % 2);
            decimal = decimal / 2;
        }
        StringBuffer sb = new StringBuffer(binary);
        return sb.reverse().toString();

    }
    public int binaryToDecimal(String binary){
        int result = 0;
        int power = 0;
        for(int i = binary.length()-1; i >= 0; i--){
            if((char)binary.charAt(i) == '1'){
                result += pow(2,power);
            }
            power++;
        }
        return result;
    }
}
