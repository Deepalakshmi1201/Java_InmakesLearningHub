import java.util.Scanner;

public class HollowRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num = sc.nextInt();
        for(int row = 1 ; row <= num ; row++)
        {

            for(int col = 1 ; col <=num+1 ; col++)
            {
                if(col == 1 || col == num + 1 || row == 1 || row == num)
                    System.out.print("*");
                else
                    System.out.print(" ");

            }
            System.out.println();
        }
    }
}
