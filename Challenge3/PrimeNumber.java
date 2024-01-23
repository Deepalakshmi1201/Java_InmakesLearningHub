package Challenge3;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        for(int i = 2 ; i <= 100 ; i++)
        {
            int c = 2;
            while(c <= i)
            {
                if(i % c == 0)
                {
                    break;
                }
                c++;
            }
            if(c == i)
                System.out.print(i+" ");
        }
    }

}
