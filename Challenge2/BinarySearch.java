package Challenge2;

import  java.util.*;
//For Sorted Array In Ascending Order
public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int[] arr = new int[7];
       for(int i = 0 ; i < arr.length ; i++)
       {
           arr[i] = sc.nextInt();
       }
        System.out.println("Enter a target: ");
       int target = sc.nextInt();

       int ans = binarySearch(arr,target);
       System.out.println("Target index : "+ans);
    }
    //if target is in array return index ,else return -1
    static int binarySearch(int[]arr,int target)
    {
        int start = 0;
        int end = arr.length-1;
        while (start <= end )
        {
            int mid = start + (end - start)/2;

            if(target > arr[mid])
            {
                start = mid + 1;
            }
            else if(target < arr[mid])
            {
                end = mid - 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
