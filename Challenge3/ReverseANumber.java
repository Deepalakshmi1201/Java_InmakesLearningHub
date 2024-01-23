package Challenge3;

import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(reverseNumber(num));
    }
    public static int reverseNumber(int num)
    {
        int rev = 0;
        while(num > 0)
        {
            int mod = num % 10;
            rev = (rev*10)+mod;
            num = num/10;
        }
        return rev;
    }
}
