class Romannum{
   
 public static void intToRoman(int num){  
System.out.println("Integer: " + num);  
int[] values = {1000,500,100,50,10,5,1};  
String[] romanLetters = {"M","D","C","L","X","V","I"};  
StringBuilder roman = new StringBuilder();  
for(int i=0;i<values.length;i++)   
{  
while(num >= values[i])   
{  
num = num - values[i];  
roman.append(romanLetters[i]);  
}  
}  
System.out.println("Corresponding Roman Numerals is: " + roman.toString());  
}  
public static void main(String args[])   
{  
intToRoman(5);  
intToRoman(28);  
intToRoman(150);  
intToRoman(15894);  
}  
}  