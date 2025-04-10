
public class Program3 {
    public static double addAmount(double wallet,double amount){
        wallet=wallet+amount;
        System.out.println(amount+"amount is added to wallet");
        return wallet;
    }
    public static double purchase(double wallet,double purchaseAmount) {
        if(purchaseAmount<=wallet){
            wallet=wallet-purchaseAmount;
            System.out.println("purchase of"+ purchaseAmount+"done successfuly");
            return wallet;
        }
        System.out.println("available wallet amount is not sufficient");
        return wallet;
        
    }
    public static double displayAmount(double wallet) {
        System.out.println("amount is:"+wallet);
        return wallet;
    
    }
    public static void main(String[] args) {
        double wallet=5000;
        displayAmount(wallet);

        wallet=addAmount(wallet, 3500);
        displayAmount(wallet);
        System.out.println("------");
        purchase(wallet, 2000);
        displayAmount(wallet);

        
    }
}

    

