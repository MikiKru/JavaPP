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
        for(int i = binary.length()-1; i >= 0; i--){
            if((char)binary.charAt(i) == '1'){
                result += pow(2,(binary.length()-1)-i);
            }
        }
        // result = "100"
        // I i= 2 , result = 0
        // II i = 1, result = 0
        // III i = 0, result = 0 + 2^(2-0) = 4
        return result;
    }
}
