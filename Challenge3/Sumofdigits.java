package Challenge3;

import java.util.Scanner;

public class Sumofdigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = getSumofdigits(num);
        System.out.println("Sum of digits: "+sum);
    }
    public static int getSumofdigits(int num)
    {
        int sum = 0;
        while(num > 0)
        {
            int mod = num % 10;
            sum = sum+mod;
            num = num/10;

        }
        return sum;
    }
}
