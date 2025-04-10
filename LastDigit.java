import java.util.Scanner;
public class LastDigit
{
  public static  boolean  rightMostDigit(int a, int b, int c)
  {
     int DigitA=a%10;
     int DigitB=b%10;
     int DigitC=c%10;
     return(DigitA==DigitB) || (DigitB==DigitC)||(DigitA==DigitC);
  }

   public static void main(String[] args)
    {
       Scanner sc= new Scanner(System.in);
          System.out.print("Enter the A number :");
          int a=sc.nextInt();
          System.out.print("Enter the B number :");
          int b=sc.nextInt();
          System.out.print("Enter the C number :");
          int c=sc.nextInt();
       
       boolean result=rightMostDigit(a, b, c);
       System.out.println("two or more of them same rightmost digit : "+ result);
   }

}
