package Challenge3;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num1 = sc.next();
        String num2 = sc.next();
        findAnagramorNot( num1,  num2);

    }
    public static void findAnagramorNot(String num1, String num2)
    {
        char[] ch1 = num1.toCharArray();
        char[] ch2 = num2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        String value = Arrays.equals(ch1,ch2) ? "Anagram" : "Not a Anagram";
        System.out.println(value);
    }
}
