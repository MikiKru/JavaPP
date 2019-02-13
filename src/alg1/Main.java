package alg1;

import alg1.controller.Algorithms1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj podstawę potęgi");
        int x = scanner.nextInt();
        System.out.println("Podaj wykładnik potęgi");
        int y = scanner.nextInt();

        Algorithms1 a = new Algorithms1();
        System.out.println(x + "^"+y+"="+a.power(x,y));
    }
}
