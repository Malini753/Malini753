import java.io.*;
import java.util.Scanner;

public class numberfromuser {
    public static void main(String[] args) {

        int n,n1;
        System.out.println("enter a number");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        n1=sc.nextInt();
        System.out.println("Entered integre is"+" "+n);
        System.out.println("Entered integre is"+" "+n1);
        if(n>n1)
        {
            System.out.println(n+ " " + " first numbers is greater");
        }
        else
        {
            System.out.println(n1+ " " + "second number is greater");
        }

        
        

    }
    
}
