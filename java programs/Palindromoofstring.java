import java.util.Scanner;

public class Palindromoofstring { 
    public static void main(String[] args) {

        System.out.println("Enter a string");
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        System.out.println("The name of the string is"+" "+name);
        int i=0,j;
        j=name.length()-1;
        while (i<j) {
            if(name.charAt(i)!=name.charAt(j))
            {

                System.out.println("It is not a palindromo");
                System.exit(0);
            }
            i++;
            j--;

        }
        System.out.println("It is a palindromo");

    }
        
    }
    

