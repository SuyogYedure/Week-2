import java.util.Scanner;
class Ex6{
  public static void main(String agrs[]){

    Scanner s= new Scanner(System.in);
    int sub1=0, sub2=0, sub3=0;
    int total=0, avg=0;
    System.out.println("Enter 3 subjects marks");
    sub1=s.nextInt();
    sub2=s.nextInt();
    sub3=s.nextInt();
    total = sub1 + sub2 + sub3;
    avg = total/3;
    System.out.println("Total marks is : " +total);
    System.out.println("Avg marks is : "+avg);
  
  }
}

  
