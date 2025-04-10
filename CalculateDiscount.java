//1.Write a Program  to calculate  the discount of a product.
class CalculateDiscount 
{
     public static void main(String[] args)
      {
        System.out.println(Discount.CalculateDiscountOfProduct(6000d, 10)) ;
     }
}

 class Discount
 {

     public static double  CalculateDiscountOfProduct( double  prize, double  discount)
     {
        double discountAmount=prize*(discount/100);
         double res=prize-discountAmount;
         return  res;
     }
     
       
}

