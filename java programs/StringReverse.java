import java.util.*;
public class StringReverse {
    public static void main(String[] args) {
        System.out.println("Enter a string");
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        System.out.println("The name of the string is"+" "+name);
        String r=" ";
        char ch;
        for(int i=0;i<name.length();i++)
        {
            ch=name.charAt(i);
            r=ch+r;
        }
        System.out.println(r);
    }
    
}
