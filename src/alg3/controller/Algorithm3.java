package alg3.controller;

public class Algorithm3 {
    public int getNWD(int x, int y){
        int greather = x;
        int lower = y;
        if(x < y){
            greather = y;
            lower = x;
        }
        for(int i = greather; i > 1; i--){
            if(greather % i == 0 && lower % i == 0){
                return i;
            }
        }
        return 1;
    }
}
