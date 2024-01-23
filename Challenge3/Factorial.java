package Challenge3;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int value = 1;
        for(int i = 1 ; i <= n ; i++)
        {
            value = value*i;
        }
        System.out.println(value);
    }
}
