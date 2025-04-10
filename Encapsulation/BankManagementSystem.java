


/*1. Bank Account Management System
Create a BankAccount class that encapsulates the following fields: accountNumber, accountHolderName, and balance.
	•	Provide getters and setters for each.
	•	Add a method deposit(double amount) and withdraw(double amount) with validation (e.g., cannot withdraw more than balance).
	•	Try accessing fields directly from another class to see encapsulation in action. */

import java.util.Scanner;
class BankAccount
{
     private int accountNumber;
     private String accountHolderName;
     private  double balance;

     BankAccount( int accountNumber, String accountHolderName,double balance)
     {
     this.accountNumber=accountNumber;
     this.accountHolderName=accountHolderName;
     this.balance=balance;
     }

     public int  getAccountNumber()  //Getter
     {
        return accountNumber;
     }
     public String getAccountHolderName()    //gatter
     {
         return accountHolderName;
     }
     public double  getBalance()    //gatter
     {
         return balance;
     }

     
    //  public  void setAccountNumber(int accountNumber)  //Setter
    //  {
    //     this.accountNumber=accountNumber;
    //  }
    //  public void setAccountHolderName( String accountHolderName)    //Setter
    //  {
    //      this.accountHolderName=accountHolderName;
    //  }
     public void   setBalance(double balance)    //Setter
     {
          this.balance=balance;
     }
      public  void deposit(double amount)
      {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
      }
      public void withdraw(double amount )
      {
        if (amount <=0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Withdrew: " + amount); 
      }
    }

    }

  public class  BankManagementSystem
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        BankAccount b1=new BankAccount(123432,"Santanu",2000);
       System.out.println("Account Holder Name is :"+ b1.getAccountHolderName());
       System.out.println("Account Number is:"+b1.getAccountNumber());
       b1.deposit(20000);
       System.out.println("After Deposite Balance : "+b1.getBalance());
       b1.withdraw(10000);
       System.out.println("Account Holder Name is :"+ b1.getAccountHolderName());
       System.out.println("Account Number is:"+b1.getAccountNumber());
       System.out.println("current Balance : "+b1.getBalance());

    System.out.println("------------------------------------------------------------------");
   
    System.out.print("Enter Acccount Number :");
     int accountNumber=sc.nextInt();
     System.out.print("Enter Acccount Holder Name is  :");
     String accountHolderName=sc.next();
     System.out.print("Enter Acccount Balance is  :");
     double balance=sc.nextDouble();
     System.out.print("Enter the Deposite Amount :");
    double  deposit=sc.nextDouble();
    System.out.print("Enter the withdrew Amount :");
    double withdraw=sc.nextDouble();

     System.out.println("Account Holder Name is "+accountNumber);
     System.out.println("Account Holder name is :"+accountHolderName);
     System.out.println("Balance is :"+balance);

     BankAccount b2=new BankAccount(accountNumber,accountHolderName,balance);


     System.out.println("Account Holder Name is :"+ b2.getAccountHolderName());
       System.out.println("Account Number is:"+b2.getAccountNumber());
       b2.deposit(deposit);
       System.out.println("After Deposite Balance : "+b2.getBalance());
       b2.withdraw(withdraw);
       System.out.println("Account Holder Name is :"+ b2.getAccountHolderName());
       System.out.println("Account Number is:"+b2.getAccountNumber());
       System.out.println("current Balance : "+b2.getBalance());

 
    }
}