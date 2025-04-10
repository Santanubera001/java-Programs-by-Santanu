class Car 
 {
    String owner;
    int model;
    String  brand;
    double price;
    double mileaga;
      Car(String owner,int model, String  brand, double price, double mileaga)
      {
           this.owner=owner;
           this.model=model;
           this.brand=brand;
           this.price=price;
           this.mileaga=mileaga; 
      }
    public void display()
    {
        System.out.println("Car owner name is: :"+owner);
        System.out.println("Car model name is :"+model);
        System.out.println("The Brand name is:"+brand);
        System.out.println("Price of the Car is :"+price);
        System.out.println("Car  milaga : "+mileaga);
        System.out.println("------------");
    } 
}
public class CarDriver
{
     public static void main(String[] args)
      {
         Car c1= new Car("santanu",332,"Toyta",100000022d,80d);
         Car c2 =new Car("avijit",465,"Hundai",100000455d,60d);
         Car c3=new Car("sweety",3332,"Toyta",300000022,90d);
         Car c4=new Car("Raj",4543,"BMW",5765000022d,50d);
         Car c5=new Car("Mukash",4553,"Lambo",54465463554d,80d);

         c1.display();
         c2.display();
         c3.display();
         c4.display();
         c5.display();

     }
}

