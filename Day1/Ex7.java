import java.util.Scanner;
class Ex7{
  public static void main(final String args[]){
  final Scanner s=new Scanner(System.in);

    int salary=0, bill1=0, bill2=0, bill3=0;
    int total=0, percent=0;

    System.out.println("Enter salary");
    salary=s.nextInt();
    System.out.println("Enter 3 bills");
    bill1 = s.nextInt();
    bill2 = s.nextInt();
    bill3 = s.nextInt();

    total = bill1 + bill2 + bill3;
    percent = (total*100) / salary;

    System.out.println("Total shopping amount is : "+total);
    System.out.println("percentage he spent on shopping is : "+percent + "%");
    
  }
}

