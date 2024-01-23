package Challenge3;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        int j = 1;
        int k = 1;
        System.out.println("the first 15 Fibonacci numbers: ");
        System.out.print("0" + " " + "1" +" "+ j);
        for(int i = 0 ; i < 12 ; i++){
            k = k + j;
            j = k - j;
            System.out.print(" "+k+" ");
        }
    }
}
