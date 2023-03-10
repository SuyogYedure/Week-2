import java.util.Scanner;
class Calculator {
   public static void main(String args[]) {
     Scanner s = new Scanner(System.in);
     int num1,num2;
      System.out.println("Enter the num1: ");
  num1=s.nextInt();
      System.out.println("Enter the num2: ");
  num2=s.nextInt();
      System.out.println("Enter the operator:+,-,*,/");
     char ch=s.next().charAt(0);
     if (ch== '+')
     {
       System.out.println(num1+num2);
     }
     else if(ch== '-'){
       System.out.println(num1-num2);
     }
      
      else if (ch== '*')
     {
       System.out.println(num1*num2);
    
     }
     else if (ch == '/'){
       System.out.println(num1/num2);
     }
     else{
       System.out.println("Invalid Operator");
     }
       
     
     }
}