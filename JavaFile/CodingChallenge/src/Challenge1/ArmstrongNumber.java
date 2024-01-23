import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num = sc.nextInt();
        int temp = num;
        double pow = 0;
        while(temp > 0)
        {
            temp = temp / 10;
            ++pow;
        }
        temp = num;
        double res = 0 ;
        while(temp > 0)
        {
            double mod = temp % 10;
            res += Math.pow(mod,pow);
            temp = temp/10;
        }
        System.out.println((num == res) ?"Armstrong number ":"Not Armstrong number ");
    }
}
