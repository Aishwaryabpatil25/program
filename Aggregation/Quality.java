public class Quality extends Bpo
   {
      int noOfReview;
      boolean isItGoodQuality;

   Quality()
      {

      }
   Quality(int noOfReview,boolean isItGoodQuality)
     {
       this.noOfReview = noOfReview;
       this.isItGoodQuality = isItGoodQuality ;
    }

   void qualityCheck()
    {
      System.out.println("check quality");
    }

   void customerSatisfie()

   {
     System.out.println("satisfies to customer");

   }

   
   void review()
   {
      System.out.println("quality review");
   }


}