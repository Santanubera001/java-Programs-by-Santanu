//5. Write a Program to simple interest
public class SimpleInterest
{
    public static void main(String[] args)
     {
         System.out.println("Intersest is :"+Interest.simpleInterest(7000, 20, 8));
    }
}
  

 class  Interest
 {
     public static double  simpleInterest(double  profit,double  ratio,double  time)
     {
           double Interest=(profit*time*ratio)/100;
           return Interest;
     }
 }