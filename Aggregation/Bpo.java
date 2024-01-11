public class Bpo extends Company
   {
     int  processId;
     boolean isItNonItCompany;
     Accounting accounting;
     Quality quality;

   Bpo()
     {
  
    }
 
  Bpo(int  processId,boolean isItNonItCompany, Accounting accounting,Quality quality)
     {
        this.processId = processId;
        this.isItNonItCompany = isItNonItCompany;
        this.accounting = accounting;
        this.quality = quality;
     }

   void provideCustomerSupport()
    {
       System.out.println("provide support for customers ");
    }

   void  performBPOTask()
    {
       System.out.println(" perform task ");
    }
}