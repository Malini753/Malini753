public class insertionsort {
    public static void main(String[] args)
    {
        int a[]={13,2,5,6,16};
        int i;
        int length=a.length;
        System.out.println("Unsorted array");
        for(i=0;i<length;i++)
        {

            System.out.print(a[i]+ " ");
        }
        for(i=1;i<length;i++)
        {
            int key=a[i];
            int j=i-1;
            while(j>=0 && a[j] >  key )
            {
                a[j+1]=key;
                j=j-1;
            }

            a[j+1]=key;

        }
        System.out.println("Sorted array");
        for(i=0;i<length;i++)
        {

            System.out.print(a[i]+ " ");
        }
    }
    
}
