public class Wallet
   {
        int currency;
        String cards;
        int cashAmount;
        String ownerName;
        int  balance;

    Wallet(int currency,String cards,int cashAmount,String ownerName,int  balance)
          {
            this.currency = currency;
            this.cards = cards;
            this.cashAmount = cashAmount;
            this.ownerName = ownerName;
            this.balance = balance;
           }
      public void display()
         {
           System.out.println("currency:"+currency);
           System.out.println("cards:"+cards);
           System.out.println("cashAmount:"+cashAmount);
           System.out.println("ownerName:"+ownerName);
           System.out.println("balance:"+balance);
          }

          static void addMoney()
            {
             System.out.println("wallet has added money");
           }
            static void spend()
                 {
                    System.out.println("wallet has added money");
                  }
            static void checkBalance()
                {
                  System.out.println("check wallet balance ");
                }

}