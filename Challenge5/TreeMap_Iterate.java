package Challenge5;

import java.util.*;

public class TreeMap_Iterate {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeMap<Integer, String> colors = new TreeMap<>();
        System.out.println("Enter a colors :");
        for (int j = 0; j < 5; j++) {
            colors.put(sc.nextInt(), sc.next());
        }
        System.out.println("Iterating a TreeMap: ");
        for (Map.Entry m : colors.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
