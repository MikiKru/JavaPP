package alg6.controller;

public class TableController {
    public int [] tableFilter(int minSupp, int tab[]){
        for(int i = 0; i < tab.length; i++){
            if(tab[i] <= minSupp){
                tab[i] = 0;
            }
        }
        return tab;
    }
}
