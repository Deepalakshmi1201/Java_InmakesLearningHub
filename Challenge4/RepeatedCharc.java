package Challenge4;

import java.util.Arrays;
import java.util.Scanner;

public class RepeatedCharc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] ch = str.toCharArray();
        Arrays.sort(ch);
        int start = 0;
        int count = 0;
         for( int next = 1 ; next < ch.length ; next++) {
             if (ch[start] != ch[next])
             {
                 if(count >= 1) {
                     System.out.print(ch[start] + " ");
                     count = 0;
                 }
                 start = next;
             }
             else
             {
                 if(ch[start] == ch[ch.length -1])
                 {
                     System.out.print(ch[start] + " ");
                 }
                 else {
                     count += 1;
                 }
             }
         }
    }
}
