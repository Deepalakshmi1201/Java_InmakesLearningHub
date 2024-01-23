package Challenge4;

import java.util.Scanner;

public class uppercaseAndlowercase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        char[] ch = s.toCharArray();
        System.out.println(getUpperCase(ch));
        System.out.println(getLowerCase(ch));

    }

    public static String getUpperCase(char[] ch) {
        for (int i = 0; i < ch.length; i++) {
            int value = (int) ch[i];
            int res = 0;
            if (value >= 97) {
                res = value - 32;
                ch[i] = (char) res;
            } else {
                ch[i] = ch[i];
            }

            res = 0;
        }
        String s = String.copyValueOf(ch);
        return s;

    }

    public static String getLowerCase(char[] ch) {
        for (int i = 0; i < ch.length; i++) {
            int value = (int) ch[i];
            int res = 0;
            if (value <= 97) {
                res = value + 32;
                ch[i] = (char) res;
            } else {
                ch[i] = ch[i];
            }
            res = 0;
        }
        String s = String.copyValueOf(ch);
        return s;

    }

}
