import java.util.Scanner;
class Age{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the year");
    int dateOfBirth;
    int b=0;
    dateOfBirth=s.nextInt();
    
    b=2023-dateOfBirth;
     System.out.println("age is: " +b);
  if(b>18){
    System.out.println("Adult");
  }
    else{
      System.out.println("Minor");
    }
  
    
    }
   

  }