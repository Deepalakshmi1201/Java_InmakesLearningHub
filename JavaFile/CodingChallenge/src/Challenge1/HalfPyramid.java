import java.util.Scanner;

public class HalfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num = sc.nextInt();

        for(int row = 0 ; row <= num ; row++)
        {
            for(int col = 1 ; col <= num - row  ; col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
