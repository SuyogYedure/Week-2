import java.util.Scanner;
class Ex12{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    float salary= 0, da=0, hra=0, Grosssalary=0;

    System.out.println("Enter the Basic Salary");
    salary = s.nextFloat();

    hra=(89*salary)/100;
    da = (90*salary)/100;
    Grosssalary = hra + da + salary;

    System.out.println("Gross Salary is : " +Grosssalary);
    
      }
}