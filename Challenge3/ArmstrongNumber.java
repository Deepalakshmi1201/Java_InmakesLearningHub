package Challenge3;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.print("First 10 Armstrong Number : ");
        for(int i = 0 ; i < 200 ; i++) {

            String s = String.valueOf(i);
            double length = s.length();
            int num = Integer.parseInt(s) ;
            int temp =  num;
            double value = 0;
            while (temp > 0) {
                int mod = temp % 10;
                value = value + Math.pow((double) mod, length);
                temp = temp / 10;

            }

            if (value == num) {
                System.out.print((int) value + " ");
            }
        }
    }
}
