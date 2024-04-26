import java.util.Scanner;

public class sumofditigs {
    
    public static void main(String[] args) {
        int n,r=0,l;
        System.out.println("enter a number to reverse");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while(n>0)
        {
            l=n%10;
            r=r+l;
            n=n/10;
        }
        System.out.println(r);

    }
}