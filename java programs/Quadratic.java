import java.util.Scanner;
import java.util.*;
public class Quadratic {
    public static void main(String[] args) {
        double a,b,c,d ,root1,root2;
        System.out.println("enter a ,b,c values");
        Scanner sc=new Scanner(System.in);
        a=sc.nextDouble();
        b=sc.nextDouble();
        c=sc.nextDouble();
        d=b*b-4*a*c;
        if(d==0)
        {
            System.out.println("roots are real and equal ");
            root1=-b/2*a;
            root2=-b/2*a;
            System.out.println(root1);
            System.out.println(root2);
            
        }
        else if (d>0) {
            System.out.println("roots are real and different ");
            root1=-b+Math.sqrt(d)/2*a;
            root2=-b-Math.sqrt(d)/2*a;
            System.out.println(root1);
            System.out.println(root2);

            
        }
        else
        {
            System.out.println("roots are imaganary");
        }


    
    }
    
}
