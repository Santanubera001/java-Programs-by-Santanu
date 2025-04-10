class Methods
{
    
    public static void areaOfCircle(double radis)
    {
         double res = 3.14d *radis*radis;

        System.out.println("Area of circle"+res);

    }

     public static void areaOfTriangle(int length,int weidth)
    {
         int res = length*weidth;

        System.out.println("Area of Triangle "+res);

    }

 public static void volumeOfcylinder(double radis , double height)
    {
         double res = 3.14d*radis*radis*height ;

        System.out.println("Volume of the cylinder "+res);

    }


  public static void areaOfCone(int length,double radis )
    {
         double res = 3.14d * radis*length;

        System.out.println("Area of Cone "+ res);

    }

    public static void areaOfCuboid(int length,int weidth,int height)
    {

     int res = 2*(length*weidth)+2*(weidth*height)+2*(length*height);
        System.out.println("Area of areaOfCuboid "+ res);

    }

         






   public static void main(String[] args) 
   {

   	 areaOfCircle(3.5d);
   	 areaOfTriangle(10,20);
      volumeOfcylinder(3.5d,6);
      areaOfCone(8,3.5d);
      areaOfCuboid(4,5,7);
      areaOfCuboid(2,4,5);



   }

}