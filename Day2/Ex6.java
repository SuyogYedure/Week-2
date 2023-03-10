import java.util.Scanner;
class Ex6 {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
 
    System.out.println("Enter number to find number of even and odd digits");
    int num=s.nextInt();  
     int edigits=0,odigits=0;
    
    while(num!=0){         
       if((num%10)%2==0){   
         edigits++;     
       }
      else{
        odigits++;     
      }
      
      num=num/10;   
        
    }
    System.out.println("Number of even digits: "+edigits);
    System.out.println("Number of odd digits: "+odigits);
    
    
    
  }
}
