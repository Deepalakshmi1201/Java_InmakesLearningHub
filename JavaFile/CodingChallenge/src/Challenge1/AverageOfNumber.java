import java.util.Scanner;
public class AverageOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lengthOfNumber = sc.nextInt();
        int sum = 0 ;
        for(int i = 0 ; i < lengthOfNumber ; i++)
        {
            int val = sc.nextInt();
            sum += val;
        }
        System.out.println("Average:"+ sum/lengthOfNumber);
    }
}
