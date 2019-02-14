package alg5;

import alg5.controller.PrimaryController;

public class Main {
    public static void main(String[] args) {
        PrimaryController pc = new PrimaryController();
        System.out.println(pc.isPrimary(7));
        System.out.println(pc.isPrimary(8));
        System.out.println(pc.isPrimary(1));

        pc.primaryGenerator(1000);
    }
}
