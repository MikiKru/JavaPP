package alg1.controller;

public class Algorithms1 {
    public int power(int x, int y){
        int result = 1;
        for(int i = 1; i <= y; i++){
            result *= x;
        }
        return result;
    }
}
