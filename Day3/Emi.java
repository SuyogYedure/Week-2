import java.util.Scanner;
class Emi {
    public static void main(String args[]) {                
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Principal Amount : ");
        double principal = s.nextDouble();   
        System.out.print("Enter the Rate of Interest : ");
        double rate = s.nextDouble();
        rate=rate/(12*100);
        System.out.print("Enter the Month ");
        int month= s.nextInt();       
        double emi= (principal*rate*Math.pow(1+rate,month))/(Math.pow(1+rate,month)-1);
        System.out.print(" EMI is= "+emi+"\n");
                
    }
}