package alg5.controller;

public class PrimaryController {
    public boolean isPrimary(int num){
        int counter = 0;
        for(int i = num - 1; i > 1; i--){
            if(num % i == 0){
                counter++;
            }
        }
        return counter > 0 || num == 1 ? false : true;
    }
    public void primaryGenerator(int n){
        int counter = 0;
        int i = 2;
        while(counter < n){
            if(isPrimary(i)){
                counter++;
                System.out.print(i + " ");
            }
            i++;
        }
    }
}
