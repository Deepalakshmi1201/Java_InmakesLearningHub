package Challenge3;

import java.util.Scanner;

public class SumofArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter a Array : ");
        for(int i = 0 ; i < arr.length ; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Sum of digits: "+getSumOfArray( arr));
    }
    public static int getSumOfArray(int[] arr) {
        int value = 0;
        for (int j : arr) {
            value = value + j;
        }
        return value;
    }
}
