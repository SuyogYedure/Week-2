import java.util.Scanner;
class Atmachine{
  public void deposit()
{
   Scanner s = new Scanner(System.in);
   System.out.println("Enter deposit amount: " );
   double amount = s.nextDouble();
   System.out.println("Your deposit amount: " + amount);
   currentBalance += amount;
   System.out.println("Your new balance is: " + currentBalance);
}

public void withdrawal()
{
   Scanner s = new Scanner(System.in);
   System.out.println("Enter withdrawal amount: " );
   double amount = s.nextDouble();
   System.out.println("Your withdrawal amount: " + amount);
   currentBalance -= amount;
   System.out.println("Your new balance is: " + currentBalance);
}


 System.out.println((deposit + oldBalance)==newBalance);


System.out.println(newBalance + withdraw);

}