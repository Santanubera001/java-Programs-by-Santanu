/*Create a class Car with fields model, company, price. Initialize them using a constructor.
  Then create an array of 5 Car objects and print their details using a loop. */

public class CarDetails
 {
    public static void main(String[] args) {
    Car[] car=new Car[4];
    car[0]=new Car(2025,"honda",25000.00);
    car[1]=new Car(2025,"tata",29999.00);
    car[2]=new Car(2025,"bmw",2699999.00);
    car[3]=new Car(2025,"byd",2799787.00);
    System.out.println("Car Details:");
    for (int i = 0; i < car.length; i++) {
        System.out.print((i + 1) + ". ");
        car[i].carDetail();
    } 
}
}


class Car
 {
    int model;
    String company;
    double price;
Car(int model,String company,double price){
    this.model=model;
    this.company=company;
    this.price=price;
}
public void carDetail()
{
    System.out.println("model of "+model+" and  company "+company+" where price is "+price);
}
}