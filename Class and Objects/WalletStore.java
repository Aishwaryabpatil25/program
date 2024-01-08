public class WalletStore
   {
    public static void main(String args[])
        {
         Wallet obj =  new Wallet(1,"MasterCard",20,"Aishwarya",10000,"brown");
           obj.display();

           Wallet.addMoney();
         
           Wallet.spend();
           
           Wallet. checkBalance();
           
   }
}