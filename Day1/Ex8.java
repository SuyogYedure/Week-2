import java.util.Scanner;
class Ex8{
  public static void main(String args[]){
  
    int num;
    Scanner s=new Scanner(System.in);
    
    System.out.println("Enter a Number");
    num = s.nextInt();
    
    if (num>0)
    {
      System.out.println("Number is positive");
    }
    
    else{
      System.out.println("Number is negative");
    }
    
    
    
  }
  
}