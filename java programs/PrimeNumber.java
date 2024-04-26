import java.util.*;

public class PrimeNumber {
    public static void main(String[] args) {
        int n,i;
        System.out.println("neter a number to chech it is prime or not");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=2;i<n;i++)
        {
            if(n%i==0)
            {
                System.out.println("It is not a prime number");
            }
            else
            {
                System.out.println("It is a prime number");
                break;
            }
        }
        
    }
}





