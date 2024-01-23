package Challenge2;

import java.util.Arrays;
import java.util.Scanner;

public class InsertNewElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i = 0 ; i < arr.length ; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter a Specified Index:");
        int index = sc.nextInt();
        System.out.println("Enter a value:");
        int value = sc.nextInt();
        int[] arr1 = new int[5+1];
        for(int i = 0 ; i < arr1.length ; i++)
        {
            if (i < index)
                arr1[i] = arr[i];
            else if (i == index)
                arr1[i] = value;
            else
                arr1[i] = arr[i - 1];

        }
        System.out.println(Arrays.toString(arr1));
    }
}
