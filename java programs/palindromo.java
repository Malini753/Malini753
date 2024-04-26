import java.io.*;
import java.util.Scanner;

class palindrome{  
    public static void main(String args[]){  
     int r,sum=0,temp;    
     int n;//It 
     System.out.println("enter a number to chech it is palindromo or not");
     Scanner  sc=new Scanner(System.in);
     n=sc.nextInt();
     temp=n;    
     while(n>0){    
      r=n%10;
      sum=(sum*10)+r;    
      n=n/10;    
     }    
     if(temp==sum)    
      System.out.println("it palindrome number ");    
     else    
      System.out.println("not palindrome");    
   }  
   }  
