package Challenge5;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_EmptyOrNot {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();

        String ans = Get_ArrayList(colors).isEmpty() ? "ArrayList is Empty" : "ArrayList is Not Empty";
        System.out.println(ans);
    }
    public static ArrayList<String> Get_ArrayList( ArrayList<String> colors)
    {
        int i = 0;
        while(i < 5)
        {
            colors.add(sc.next());
            i++;
        }
        return colors;
    }
}
