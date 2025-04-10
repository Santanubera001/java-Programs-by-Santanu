/*Create a class Product with productId, productName, price, and quantity.
Create a method getTotalPrice() that returns price * quantity.
In main(), create multiple Product objects using constructors and calculate total bill amount of all products purchased. */
class Product
{
  int productId;
  String productName;
  double price;
  double quantity;
  Product(int productId,String productName,double price,double quantity)
  {
     this.productId=productId;
     this.productName=productName;
     this.price=price;
     this.quantity=quantity;
  }
  public double  getTotalPrice()
  {
     double bill=price*quantity;
      System.out.println(" ProductId is "+ productId +" and "+" Name of the "+productName+" And the Price is "+price+" and the quantity "+quantity);
      System.out.println("Total bill of the  product: "+bill);
      return price * quantity;   
  }
}
public class ProductDetails 
{
   public static void main(String[] args) 
   {
      double totalBill=0;
       Product p1=new Product(01,"Laptop",40000.00,5);
       Product p2=new Product(02,"TV",30000.00,10);
       Product p3=new Product(03,"Phone",20000.00,30);
       Product p4=new Product(04,"CPU",25000.00,15);
      //  p3.getTotalPrice();
      //  p1.getTotalPrice();
      //  p2.getTotalPrice();
      //  p4.getTotalPrice();
       totalBill+=p1.getTotalPrice();
       totalBill+=p2.getTotalPrice();
       totalBill+=p3.getTotalPrice();
       totalBill+=p4.getTotalPrice();    
       System.out.println("Total Bill Amount for all the Product  is : " + totalBill);

   } 
}



