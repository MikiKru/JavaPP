package alg1;

import alg1.controller.Algorithms1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Podaj podstawę potęgi");
//        int x = scanner.nextInt();
//        System.out.println("Podaj wykładnik potęgi");
//        int y = scanner.nextInt();

        // P1
        Algorithms1 a = new Algorithms1();
//        System.out.println(x + "^"+y+"="+a.power(x,y));
        // P2
        System.out.println(a.factorial(5));
        System.out.println(a.factorial(-5));
        // P3
        System.out.println(a.geoSequence(2,3,3));
        // P4
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("Wprowadź kolejno a, r, n");
            try {
                System.out.println(
                        a.arSequence(
                                scanner.nextInt(),
                                scanner.nextInt(),
                                scanner.nextInt()
                        )
                );
                break;
            } catch (InputMismatchException e) {
                System.out.println("Błąd danych");
            } finally {
                scanner.nextLine();
            }
        }

    }
}
