package Challenge2;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicateElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[7];
        for(int i = 0 ; i < arr.length ; i++)
        {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int unique = 0;
        for(int i = 0 ; i < arr.length ; i++)
        {
            if (arr[unique] != arr[i]) {
                unique++;
                arr[unique] = arr[i];
            }

        }
        System.out.println("After removed Duplicate Elements:");

        for(int i = 0 ; i <= unique ; i++)
        {
            System.out.print(" "+arr[i]);
        }
    }
}
