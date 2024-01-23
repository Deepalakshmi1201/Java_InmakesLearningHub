import java.util.Scanner;

public class FullDiamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num = sc.nextInt();
        for(int row = 1 ; row < (2*num); row++)
        {
            int spaces = row <= num ? num - row : row - num;
            int total = row <= num ? (2*row)-1 : 2*(2*num - row)-1;
            for(int s = 1 ; s <= spaces; s++)
            {
                System.out.print(" ");
            }
            for(int col = 1 ; col <= total; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
