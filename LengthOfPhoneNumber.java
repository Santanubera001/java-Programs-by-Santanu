//3.Wtite a Program to calculate the lenght of phone Number.
public class LengthOfPhoneNumber 
{
    public static void main(String[] args) 
    {
        System.out.println("Length of the Phone Number is :"+PhoneNumber.lengthOfPhoneNumber(8101746003l));
    }
}
class  PhoneNumber
{
      public  static long   lengthOfPhoneNumber( long number)
      
      {
        long count=0;
           while(number>0){
              number=number/10;
              count++;
           }
           return count;
      }
}
