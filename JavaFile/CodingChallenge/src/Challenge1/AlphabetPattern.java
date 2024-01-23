package Challenge1;

import java.util.Scanner;

public class AlphabetPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num = sc.nextInt();
        for(int row = 0 ; row < num ; row++)
        {
            int spaces = num - (num-row);
            for(int s = 1 ; s <= spaces  ; s++)
            {
                System.out.print(" ");
            }
            char ch = 'A';
            for(int col = 1 ; col <=  num-row ; col++)
            {
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
}
