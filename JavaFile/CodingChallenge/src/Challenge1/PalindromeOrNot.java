import java.util.Scanner;

public class PalindromeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num :");
        int num = sc.nextInt();
        int rev = 0;
        int temp = num;
        while(temp > 0)
        {
            int mod = temp % 10;
            rev = rev * 10 + mod ;
            temp = temp / 10;
        }
        System.out.println((num == rev) ?"Palindrome":"Not Palindrome");
    }
}
