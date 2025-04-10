//2.Write a Program to convert celcius to farenheight.
public class CalculateFerhenhite 
{
     public static void main(String[] args)
      {
        System.out.println("Temperature is "+Celcius.temperratureCalculate(90, 23));
     }
}
 class Celcius
 {
    public  static  double  temperratureCalculate(double  Celcius,double  ferhrenheight) 
  {
       ferhrenheight=((Celcius*9)/5) +32;
       return   ferhrenheight;
    }
 }

