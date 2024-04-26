import java.util.Scanner;
class ASCII {
    public static void main(String[] args) {
        char ch;
        System.out.println("enter a character");
        Scanner sc=new Scanner(System.in);
        ch=sc.next().charAt(0);
        int value=ch;
        System.out.println(value);
    }
}
