public class Accounting extends Bpo
   {
      
     int balance ;
     int tax;

     Accounting()
      {
      }
   
     Accounting(int balance,int tax)
       {
         this.balance = balance;
         this.tax = tax;
      }

    void maintance()
     {
       System.out.println("maintaing account");
     }

    void processInvoice()

    {
      System.out.println("process invoice");
    }
}