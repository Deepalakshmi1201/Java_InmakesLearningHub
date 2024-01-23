package Challenge5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Sort_By_Keys {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        HashMap<Integer,String> student = new HashMap<>();
        System.out.println("Before Sorted : ");
        for (int j = 0; j < 5; j++) {
            student.put(sc.nextInt(), sc.next());
        }
        System.out.println("After Sorted : ");
        for(Map.Entry m : sortByKeys(student).entrySet()){
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
    public  static TreeMap<Integer,String> sortByKeys( HashMap<Integer,String> student){

        TreeMap<Integer , String> studs = new TreeMap<>();
        studs.putAll(student);
        return studs;
    }
}
