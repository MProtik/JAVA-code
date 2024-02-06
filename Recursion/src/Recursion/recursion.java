package Recursion;
import java.util.Scanner;

public class recursion {

    static int series(int n){
        int s = 0;
        if(n <= 1)
            return 1;
        else
           return series(n-1) + series(n-2);
    }

    public static void main(String args[]){
        System.out.println("series= " + series(60));


    }
}
