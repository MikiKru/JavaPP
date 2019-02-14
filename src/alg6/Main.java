package alg6;

import alg6.controller.TableController;

public class Main {
    public static void main(String[] args) {
        TableController tc = new TableController();
        int tab [] = {1,2,3,4,5,4,6,5,7,6,5,3};

        for(int element : tc.tableFilter(5,tab)){
            System.out.print(element + " ");
        }
        System.out.println();
        for(int element : tab){
            System.out.print(element + " ");
        }
    }
}
