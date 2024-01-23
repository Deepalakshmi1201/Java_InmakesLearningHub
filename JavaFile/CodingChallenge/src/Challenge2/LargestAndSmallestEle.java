package Challenge2;

import java.util.Arrays;
import java.util.Scanner;

public class LargestAndSmallestEle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[7];
        for(int i = 0 ; i < arr.length ; i++)
        {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Second Smallest Element in array:"+arr[1]);
        System.out.println("Third Largest Element in array:"+arr[arr.length-3]);
        //Another method to calculate Third-Largest Element in array.
        for(int i = 0 ; i < arr.length ; i++)
        {
            int start = 0;
            int end = arr.length -1;
            while(start < end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Third Largest Element in array:"+arr[2]);
    }
}
