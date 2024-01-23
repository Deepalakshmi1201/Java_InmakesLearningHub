package Challenge4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine()+ " ";
        System.out.println(ReverseString(getStringWord( s)));

    }

    public static List<String> getStringWord(String s) {
        String word = "";
        char[] ch = s.toCharArray();
        ArrayList<String> list = new ArrayList();

        for (int i = 0; i < ch.length; i++) {

            if (ch[i] != ' ') {
                word = word + ch[i];
            }
            else {
                list.add(word);
                word = "";
                continue;
            }

        }
        return list;

    }

    public static String ReverseString(List<String> list) {

        String word = "";
        Collections.reverse(list);
        for (String s : list) {
            word = word + " " + s;
        }
        return word;

    }
}
