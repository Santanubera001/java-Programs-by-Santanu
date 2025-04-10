import java.util.Scanner;
public class AtmMachine
{
      public  static  double   withdrewAmount (double amount,double wallet )
      { 
        if (amount<=wallet)
        {
            if (amount%100==0 && amount<=20000 && amount>0)
            {
                wallet=wallet-amount;
               System.out.println(amount+"Withdrew Succesfull");
            }
            else
               {
                  System.out.println("Invalid amount");
             }
      }
      else
      {
           System.out.println("Insficient Balance");
      }
      return wallet;
    }
      public static double  depositeAmount(double amount,double  wellat)
      {
          if(amount%500==0 && amount>0 && amount==40000)
          {
            wellat=wellat-amount;
          }
          else
          { 
            System.out.println("Invalid amount display");
          }
    return wellat;

       }

  public  static void   checkBalance(double  wallet)
  {
     System.out.println("balance is avilable"+wallet);
  }
     public static void main(String[] args)
      {
        Scanner sc= new Scanner(System.in);
        System.out.println("------welcome the ATM Machine------");
        double wellat=2000;
        boolean f = true;
      
     while(f==true)
    {
                 
        System.out.println("1.Withdrew");
        System.out.println("2.Deposite");
        System.out.println("3.Check balance");
        System.out.println("4.Exit");
        System.out.println("------------------------------");
         System.out.println();
        System.out.println("Enter the Choice");

        int Choice=sc.nextInt();
        switch(Choice)
        {
            case 1:
                System.out.println("enter the amount to withdrew??");
                double withdrew=sc.nextDouble();
                wellat=withdrewAmount(withdrew, wellat);
                break;
                case 2:
                System.out.println("enter the amount to diposite....");
                double diposite=sc.nextDouble();
                wellat=depositeAmount(diposite,wellat);
             case 3:
                 checkBalance(wellat);
                   break;
            case 4 :
               f = false;
						 break;
				default : System.out.println("Invalid input.....");
        }
           }
         System.out.println("Thank you .. visit again");
        
     }
    
}

