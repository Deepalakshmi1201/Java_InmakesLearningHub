package Challenge4;

import java.util.Scanner;

public class firstandlast {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        char[] ch = s.toCharArray();
        char[] ch1 = new char[ch.length - 2];

        int j = 0;
        for (int i = 0; i < ch.length; i++) {
            if (i >= 1 && i <= ch.length - 2) {
                ch1[j] = ch[i];
                j++;
            } else {
                continue;
            }
        }
        System.out.println(String.valueOf(ch1));

    }

}
