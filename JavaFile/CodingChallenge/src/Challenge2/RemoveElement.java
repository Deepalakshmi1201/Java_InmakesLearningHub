package Challenge2;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i = 0 ; i < arr.length ; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter target :");
        int target = sc.nextInt();
        Arrays.sort(arr);
        int unique = 0;
        int[] res = new int[arr.length-1];
        for(int i = 0; i < arr.length ; i++)
        {
            if(arr[i] != target){
                res[unique] = arr[i];
                unique++;
            }
        }
        System.out.println(Arrays.toString(res));
        
    }
}
