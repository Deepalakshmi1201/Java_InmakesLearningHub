package Challenge2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MultiplyMatrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row1 = sc.nextInt();
        int col1 = sc.nextInt();
        int row2 = sc.nextInt();
        int col2 = sc.nextInt();
        int[][] arr1 = new int[row1][col1];
        int[][] arr2 = new int[row2][col2];
        for(int i = 0 ; i < row1 ; i++)
        {
            for(int j = 0 ; j < col1 ; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        for(int i = 0 ; i < row2 ; i++)
        {
            for(int j = 0 ; j < col2 ; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }
            //Multiply 2D array
            int[][] arr3 = new int[row1][col2];
            for (int i = 0; i < row1; i++) {  //row1 -> arr1,arr3

                for (int j = 0;j < col2 ; j++) //col2 -> arr2,arr3
                {
                    for (int k = 0; k < row2 ; k++) { //row2 -> arr2
                        arr3[i][j] += arr1[i][k] * arr2[k][j];
                    }
                }
            }

            for (int[] a : arr1) {
                System.out.println("Array1: "+Arrays.toString(a));
            }
            for (int[] a : arr2) {
            System.out.println("Array2: "+Arrays.toString(a));

            }

        if (row2 != col1) {
            System.out.println("Matrix Multiplication Not Possible");
        }

        else {
            System.out.println("Output :");
            for (int[] a : arr3) {
                System.out.println(Arrays.toString(a));
            }
        }
    }
}
