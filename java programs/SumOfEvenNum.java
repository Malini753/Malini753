import java.util.Scanner;

public class SumOfEvenNum {
    public static void main(String[] args) {
        
        int num,sum=0,i;
        System.out.println("enter a number");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        for(i=1;i<=num;i++)
        {
            if(num%2==0)
            {
                sum=sum+i;
            }
        }
        System.out.println(sum);
    }
    
}
