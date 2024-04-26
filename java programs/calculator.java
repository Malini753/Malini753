import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    Double number1, number2, result;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter first number");
    number1 = s.nextDouble();
    System.out.println("Enter second number");
    number2 = s.nextDouble();
    char operator;
    System.out.println("enter a operter( + - & / % )");
    operator=s.next().charAt(0);
    switch (operator) {

      case '+':
        result = number1 + number2;
        System.out.println(number1 + " + " + number2 + " = " + result);
        break;

      
      case '-':
        result = number1 - number2;
        System.out.println(number1 + " - " + number2 + " = " + result);
        break;

      
      case '*':
        result = number1 * number2;
        System.out.println(number1 + " * " + number2 + " = " + result);
        break;


      case '/':
        result = number1 / number2;
        System.out.println(number1 + " / " + number2 + " = " + result);
        break;

      default:
        System.out.println("Invalid operator!");
        break;
    }

    
  }
}