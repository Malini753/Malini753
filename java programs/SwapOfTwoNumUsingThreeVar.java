import java.util.Scanner;

public class SwapOfTwoNumUsingThreeVar {

    public static void main(String[] args) {
        int a,b;
        System.out.println("enter two numbers");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        a=a+b-(b=a);
        System.out.println(" after swapping ");
        System.out.println(a);
        System.out.println(b);

        
    }
    
}
