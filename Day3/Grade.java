import java.util.Scanner;
class Grade {
   public static void main(String args[]) {
     Scanner s = new Scanner(System.in);
     int marks;
       System.out.println("Enter the marks:");
  marks=s.nextInt();
     if(marks>=90 && marks<100) 
     {
       System.out.println("Grade A");
     }
     else if(marks>60 && marks<90)   
     {
         System.out.println("Grade B");
     }
     else if(marks>35 && marks<60)
     {
         System.out.println("Grade C");
     }
     else
     {
         System.out.println("Fail");
     }
   }
}