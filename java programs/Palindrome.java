import java.util.Scanner;

class Palindrome {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter a number to check weather Prime or not");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        for (int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                System.out.println("The number a prime ");
            }
            else
            {
                System.out.println("The number a not prime ");
                break;
            }
        }
    }
}
