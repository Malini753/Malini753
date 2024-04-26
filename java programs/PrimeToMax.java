import java.util.Scanner;
public class PrimeToMax {
    public static void main(String args[])
    {
        int min,max,i,j,count;
        System.out.println("enter min and miax number ");
        Scanner sc=new Scanner(System.in);
        min=sc.nextInt();
        max=sc.nextInt();
        for(j=min;j<=max;j++)
        {
            count =0;
            for(i=1;i<=j;i++)
            {
                if(j%i==0)
                {
                    count=count+1;
                }
            }
                if(count==2)
                {
                    System.out.print(j+" ");
                }
                
            

        }

    }
    
}
