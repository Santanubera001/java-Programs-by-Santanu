

/*Create a class Rectangle with length and breadth. Use a constructor to initialize the values. Calculate 
and print the area using a method calculateArea()*/
 public class Rectangle
{
   public static void main(String[] args) 
   {
       RectangleDetails r1=new  RectangleDetails(60,3);
       r1.calculateArea();
   }
}
  class RectangleDetails 
{ 
   double length;
   double breadth;
    
   RectangleDetails(double length,double breadth)
   {
      this.breadth=breadth;
      this.length=length;   
   }
public void  calculateArea()
  {
     System.out.println("Area of Rectangle is:"+(breadth*length));
  }

}



