package Challenge2;

import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr1 = new int[5];
        int[] arr2 = new int[5];
        for(int i = 0 ; i < arr1.length ; i++)
        {
            arr1[i] = sc.nextInt();
        }
        for(int i = 0 ; i < arr2.length ; i++)
        {
            arr2[i] = sc.nextInt();
        }
        System.out.println("Array1 : "+Arrays.toString(arr1));
        System.out.println("Array2 : "+Arrays.toString(arr2));
        int n = arr1.length+ arr2.length;
        int[] merge = new int[n];
//        for(int j = 0 ; j < n ; j++)
//        {
//            if(j >= arr1.length) {
//
//                merge[j] = arr2[j- arr2.length];
//
//            }
//            else
//            {
//                    merge[j] = arr1[j];
//
//            }
//        }
        System.arraycopy(arr1, 0, merge, 0, arr1.length);
        System.arraycopy(arr2, 0, merge, arr1.length, arr2.length);

        System.out.println("Merged Array : "+Arrays.toString(merge));
    }
}
