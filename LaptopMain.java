
 public  class LaptopMain
{
    public static void main(String[] args) 
    {
        Laptop l= new Laptop();
        l.brand="HP";
        // l.model=;
        l.Price=50000;
        l.ram=8;
        l.storage=512;
        l.displayDetails();
        System.out.println("---------------------");
        Laptop l1= new Laptop();
        l1.brand="Dell";
        // l.model=;
        l1.Price=60000;
        l1.ram=8;
        l1.storage=1024;
        l1.displayDetails();
       
    }
    
}

 class Laptop
 {
     int ram;
     int storage;
     int Price;
    //  char model;
     String brand;

     public void displayDetails()
     {
        System.out.println("Ram is :"+ram);
        System.out.println("Storage is :"+storage);
        System.out.println("Price is :"+Price);
        System.out.println("Brand is :"+brand);
     }
}

