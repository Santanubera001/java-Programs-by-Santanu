// 4.Write a Program  to find out the speed of vehicle 
//          <40 --> low speed
//          >=40 and <=60 --> average speed
//          >60 --->high speed 


public class SpeedOfTheCar 
{
     public static void main(String[] args)
      {
         System.out.println(Speed.checkTheCarSpeed(50));
     }
}
class  Speed
{
 public  static  String   checkTheCarSpeed( int speed)
 
 {
      if(speed<40)
        return "Low Speed";
       
      else if(speed>=40 && speed<=60)
         return "Speed is Average";

      else if(speed<60)
         return  "High Speed";
      else
         return "Over speed"  ;  
 }
 

}
