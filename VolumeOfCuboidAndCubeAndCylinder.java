// 6. Write a Program to find volume of cuboid.
// 7. write a Program to find volume of cube.
// 8.write a Program to volume of cylinder.
public class VolumeOfCuboidAndCubeAndCylinder 
{
    public static void main(String[] args) 
    {
         System.out.println("Volume of Cube is :"+Cuboid.volumeOfCuboid(6, 3, 2));
         System.out.println("Volum of Cylinder  is:"+Cylinder.volumeOfCylinder(4,6 ));
        System.out.println("Volum of Cube is :"+Cube.volumeOfCube(5));
    }
}
class Cuboid
{
 public static double  volumeOfCuboid( double  Length,double breadth,double height) 
 {
      return  Length*breadth*height; 
 }
}
class Cylinder
{
    public static double  volumeOfCylinder( double  Length,double height)
     {
         double pi=3.14d;
          return  (pi*(Length*Length)*height);
    }
}
class Cube
{
 public static double  volumeOfCube( double side) 
 {
      return  side*side*side;
 }
}
