import java.util.Scanner;

public class NumberPyramid15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num = sc.nextInt();
        for(int row = 0 ; row < num ; row++)
        {

            for(int col = 1 ; col <= num ; col++){
                System.out.print(num-row+" ");
            }
            System.out.println();
        }
    }
}
