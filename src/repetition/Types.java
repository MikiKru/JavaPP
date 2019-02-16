package repetition;

import java.math.BigInteger;

public class Types {
    public static void main(String[] args) {
        // typy proste
        int year = 2_000;
        char flag = 'A';
        double salary = 8999.955439;
        boolean decision = true;


        System.out.println(year / 3);           // int / int = int
        // konwersja -> rozszerzająca
        System.out.println("Konwersja rozszerzająca: "+ (double)year / 3);   // double / int = double
        System.out.println(year / 3.);          // int / double = double

        // konwersja -> zawężająca
        System.out.println("Konwersja zawężająca: "+ (int) salary);
//        salary = (int) salary;
        System.out.println("Warotść oryginalna:" + salary);
        // zaokrąglanie
        System.out.printf("%d | %c | %.2f | %s \n", year, flag, salary, decision);

        // opearcje na znakach
        System.out.println(flag + 10);
        System.out.println((char)(flag + 10));

        String bigNum1 = "333333333333333333333";
        String bigNum2 = "22222222222222222222222";
        // Klasa wielkich liczb implementująca operatory matematyczne
        BigInteger bi1 = new BigInteger(bigNum1);
        BigInteger bi2 = new BigInteger(bigNum2);
//        System.out.println(bigNum1 + bigNum2);

        System.out.println(bi1.add(bi2));
        System.out.println(bi1.subtract(bi2));
        System.out.println(bi1.multiply(bi2));
        System.out.println(bi1.divide(bi2));

    }
}
