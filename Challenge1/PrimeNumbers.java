import java.util.Scanner;
public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        for(int i = 2 ; i <= limit ; i++)
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
