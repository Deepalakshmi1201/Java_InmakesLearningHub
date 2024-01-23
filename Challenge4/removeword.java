package Challenge4;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class removeword {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = in.nextLine() + " ";
        System.out.println("Enter a word to remover:");
        String target = in.nextLine();
        System.out.println(removeAword(getStringWord(s) , target));

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
    public static String removeAword(List<String> list , String target)
    {
        String word = "";

        for (String s : list) {
            if(!Objects.equals(target, s)) {
                word = word + " " + s;
            }
        }
        return word;
    }
}
