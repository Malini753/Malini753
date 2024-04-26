import java.util.Scanner;

public class Factorial {
    
    public static void main(String[] args) {
    
        int n ,i;
        System.out.println("enter a number");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int fact=1;
        for(i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println(fact);
    }

    
}
