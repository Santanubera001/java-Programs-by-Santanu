class  Laptop
{
    int laptopId;
    String brand;
    double price;

    Laptop()
    {}
    Laptop(int laptopId)
    {
        this.laptopId=laptopId;
    }
    Laptop(int laptopId,String brand)
    {
      this.laptopId=laptopId;
      this.brand=brand;
    }
    Laptop(int laptopId,String brand,double price)
    {
        this.laptopId=laptopId;
        this.brand=brand;
        this.price=price;
    } 
    public  void displayLaptop()
    {
       System.out.println("LaptopId is :"+laptopId);
       System.out.println("Laptop brand is :"+brand);
       System.out.println("Price of the Laptop :"+price);
       System.out.println("------------------");
    }
}
public class ConstructorOverLoding
 {
    public static void main(String[] args)
   {
      Laptop l1=new Laptop(); 
      Laptop l2=new Laptop(001);
      Laptop l3=new Laptop(0003,"Hp");
      Laptop l4=new Laptop(0004,"Lenovo",45000d);
      l1.displayLaptop();
      l2.displayLaptop();
      l3.displayLaptop();
      l4.displayLaptop();
       


     

   }    

}
