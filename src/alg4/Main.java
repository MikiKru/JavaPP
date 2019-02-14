package alg4;

import alg4.controller.Controller;


public class Main {
    public static void main(String[] args) {
        Controller c = new Controller();
        System.out.println(c.decimalToBinary(4));
        System.out.println(c.decimalToBinary(15));

        System.out.println(c.binaryToDecimal("1111"));
        System.out.println(c.binaryToDecimal("100"));
    }
}
