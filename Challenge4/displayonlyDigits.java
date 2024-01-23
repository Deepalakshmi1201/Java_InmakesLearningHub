package Challenge4;

import java.util.Arrays;
import java.util.Scanner;

public class displayonlyDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] >= '0' && ch[i] <= '9') {
                System.out.print(ch[i]);
            } else {
                continue;
            }
        }
    }

}