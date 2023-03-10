import java.util.Scanner;
class SimpleInterest {
    public static void main(String args[]){
        float principal, rate, time, simpleInterest;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Principal Amount : ");
        principal = s.nextFloat();
        System.out.print("Enter the Rate of Interest : ");
        rate = s.nextFloat();
        System.out.print("Time period for Day or Month or Yearly?(Enter No of Days for Daily,30 for month and 12 for yearly) : ");
        time = s.nextFloat();
        
      if(time==30)
      {
        time=30;
        simpleInterest = (principal * rate * time) / 100;
        System.out.print("Simple Interest is: " +simpleInterest);
      }
      else if(time==12){
        time=30*12;
        simpleInterest = (principal * rate * time) / 100;
        System.out.print("Simple Interest is: " +simpleInterest);
      }
      else{
        simpleInterest = (principal * rate * time) / 100;
        System.out.print("Simple Interest is: " +simpleInterest);
      }
    }
}