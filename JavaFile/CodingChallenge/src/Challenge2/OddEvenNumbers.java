package Challenge2;

import java.util.Scanner;

public class OddEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for(int i = 0 ; i < arr.length ; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.print("Even Numbers : " );
        for(int j = 0 ; j < arr.length ; j++)
        {
            if(arr[j] % 2 == 0)
            {
                System.out.print(" " +arr[j]);
            }
        }
        System.out.println();
        System.out.print("Odd Numbers : " );
        for(int j = 0 ; j < arr.length ; j++)
        {
            if(arr[j] % 2 != 0)
            {
                System.out.print(" " +arr[j]);
            }
        }
    }
}
