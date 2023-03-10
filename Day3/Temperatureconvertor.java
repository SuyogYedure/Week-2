import java.util.Scanner;
class Temperatureconvertor {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    System.out.println("Celsius to Fahrenheit (1) ");
    System.out.println("Fahrenheit to Celsius (2) ");
    int tempCelsius, tempFahrenheit, temp;
    temp = s.nextInt();
    if (temp == 1) {
      System.out.println("Enter the temperature in Celsius ");
      tempCelsius = s.nextInt();
      tempFahrenheit = (tempCelsius *(9/5)) + 32;
      System.out.println("After conversion temperature is " + tempFahrenheit);
    } else if(temp==2){
      System.out.println("Enter the temperature in Fahrenheit ");
      tempFahrenheit = s.nextInt();
      tempCelsius = ((tempFahrenheit - 32) * 5) / 9;
      System.out.println("After conversion temperature is " + tempCelsius);
    }
  }
}
      
  
  
