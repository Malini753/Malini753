import java.util.Scanner;

public class CharAtindex {

    public static void main(String[] args) {
        
        System.out.println("Enter a string");
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        
        System.out.println("Enter a index");

        int index=sc.nextInt();

        char a=name.charAt(index);
        System.out.println("Name of the string is"+" "+name+" at the index"+" "+index+"the letter is present"+" "+a);
    }
    
}
