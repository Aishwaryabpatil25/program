public class Software extends It
   {
     
     boolean isItSoftwareCompany;
     String  types;

   Software()
       {
       }
   Software(  boolean isItSoftwareCompany,String  types)
     {
        this.isItSoftwareCompany = isItSoftwareCompany;
         this.types = types;
     }

   void operateComputers()
    {
     System.out.println("operate computers");
    }

  void creationOfSoftwareProduct()
   {
    
     System.out.println("creation of products ");
   }
}