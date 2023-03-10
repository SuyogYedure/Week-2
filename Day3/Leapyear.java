import java.util.Scanner;
class Leapyear{

    public static void main(String args[]){

    	int year;
    	Scanner s = new Scanner(System.in);
    	System.out.println("Enter Year: ");
    	year = s.nextInt();
    	
        boolean yrisLeap = false;

        if(year % 4 == 0)
        {
            if( year % 100 == 0)
            {
                if ( year % 400 == 0)
                    yrisLeap = true;
                else
                    yrisLeap = false;
            }
            else
                yrisLeap = true;
        }
        else {
            yrisLeap = false;
        }

        if(yrisLeap==true)
            System.out.println(year + " is a Leap Year.");
        else
            System.out.println(year + " is not a Leap Year.");
    }
}