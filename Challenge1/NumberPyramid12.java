import java.util.Scanner;

public class NumberPyramid12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num = sc.nextInt();
        int n = 1;
        for(int row = 1 ; row <= num ; row++)
        {
            for(int col = 1 ; col <= row  ; col++){
                System.out.print(n+" ");
                n++;
            }
            System.out.println();
            n = n++;
        }
    }
}
