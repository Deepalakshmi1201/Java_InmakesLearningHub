package Challenge3;

import java.util.Arrays;
import java.util.Scanner;

public class StringReverse {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String s1 = reverse(s);
        System.out.println(s1);
    }
    public static String reverse(String s)
    {
        String s1 ="";

        for( int i = 0 ; i < s.length() ; i++)
        {
            char ch  = s.charAt(i);
            s1 = ch+s1;
        }
        return s1;
    }


}
