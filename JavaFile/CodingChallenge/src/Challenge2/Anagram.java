package Challenge2;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        if(c1.length != c2.length){
            System.out.println("Not a Anagram");
        }
        else {
            String ans = Arrays.equals(c1, c2) ? "Anagram" : "Not a Anagram";
            System.out.println(ans);
        }
    }
}
