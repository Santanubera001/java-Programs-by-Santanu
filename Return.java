
import java.util.Scanner;

public class Return 
{

    public static String divisible(int a)
    {
        if(a%3==0 && a%7==0)
        {
            return "Fizz Buzz";
        }
       else if(a%3==0)
        {
            return "Fize";
        }
       else if(a%7==0)
        {
         return "Buzz";
        }
        else
        {
             return "Invalid";
        }
    }


      public static void main(String[] agrs)
       {
        Scanner sweety =new Scanner(System.in);
        System.out.print("Enter the Number :");
        int a=sweety.nextInt();
        String res=divisible(a);
       System.out.println(res);

      }
}
