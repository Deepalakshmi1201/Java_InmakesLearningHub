package Challenge3;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class WordAndCountOccurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        System.out.println("Enter a string:");
        for(int i = 0 ; i < 7 ; i++)
        {
            list.add(sc.next());
        }
        System.out.println("Enter a target:");
        String target = sc.next();
       int count =  wordcount(  list , target);
        System.out.println( target +" " + count);
    }
    public static int wordcount( ArrayList<String> list , String target)
    {
        int count = 0;

        for(String s :list)
        {
            if(Objects.equals(target, s))
            {
                count += 1;
            }
        }
        return count;
    }
}
