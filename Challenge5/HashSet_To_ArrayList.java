package Challenge5;

import java.util.*;

public class HashSet_To_ArrayList {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        HashSet<String> student = new HashSet<>();
      for (int j = 0; j < 5; j++) {
           student.add(sc.next());
        }
        for(int i = 0 ; i < student.size() ; i++) {
            System.out.println("Arraylist Elements " + i + " : " + convertion(student).get(i) );
        }

    }
    public static ArrayList<String> convertion(HashSet<String> student){
        ArrayList<String> student_name = new ArrayList<>(student);
        return student_name;
    }
}
