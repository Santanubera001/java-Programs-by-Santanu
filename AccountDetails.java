 /*Create a class Account with fields: accountHolder, accountNumber, and balance. Write a constructor to initialize them.
  In main(), create 3 account objects and display their details*/
class Account 
{
    String accountHolder;
    long accountNumber;
    double balance;

    Account(String accountHolder,long accountNumber,  double balance)
     
    {
        this.accountHolder=accountHolder;
        this.accountNumber=accountNumber;
        this.balance=balance;
    } 

    public void  display() 
    {
       System.out.println("The name of account Holder is:"+accountHolder);
       System.out.println("Account Number is :"+accountNumber);
       System.out.println("Cuurent Balence is :"+balance);
       System.out.println("-------------------");
    }
}
public class AccountDetails
{
  public static void main(String[] args) 
   {
         Account a1=new  Account("Santanu",23456000111l,10000000d);
        Account a2=new  Account("Avijit",234589577585l,7000000d);
        Account a3=new  Account("Gourav",234566457454l,5000000d);
        a1.display();
        a2.display();
        a3.display();
   } 
}
