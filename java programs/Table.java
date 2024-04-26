import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        int num,i;
        System.out.println("enter a number");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        for(i=1;i<=10;i++)
        {
            System.out.println(num+" x "+i+" = "+num*i);
        }
    }
    
}
