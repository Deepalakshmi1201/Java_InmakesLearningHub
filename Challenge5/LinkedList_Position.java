package Challenge5;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedList_Position {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        LinkedList<Integer> rollno = new LinkedList<>();
        System.out.println("Enter a specified position : ");
        int position = sc.nextInt();

        System.out.println("list after insert element in specified position: " + InsertElement( rollno , position) );

    }
    public static LinkedList<Integer> InsertElement(LinkedList<Integer> rollno , int position) {
        System.out.println("Roll no's :");
        for(int i = 0 ; i < 5 ; i++)
        {
            rollno.add(sc.nextInt());
        }
        System.out.println(rollno);
        rollno.set(position-1,18);
        return rollno;
    }
}
