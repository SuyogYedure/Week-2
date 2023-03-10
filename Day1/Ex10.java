import java.util.Scanner;
class Ex10 {
 public static void main(String[] args){
    int age, diff;

    Scanner s = new Scanner(System.in);
    System.out.println("Please enter your age: ");
    age = s.nextInt();
    
  
    if(age>=18)
    {
        System.out.println("You are eligible for voting.");
    }
    else
    {
    diff = (18 - age);
    System.out.println("Sorry,You can vote after: "+ diff + " years");
    }
 }
}