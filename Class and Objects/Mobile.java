public class Mobile
  {
    String brand;
    String model;
    int batteryLevel;
    int currentNetwork;
    String chargerType;
  
   Mobile( String brand,String model,int batteryLevel,int currentNetwork,String chargerType)
         {
         this.brand = brand;
         this.model = model;
         this.batteryLevel = batteryLevel;
         this.currentNetwork = currentNetwork;
         this.chargerType = chargerType;
       }


     public void diplay()
          {
            System.out.println("brand:"+brand);
            System.out.println(" model:"+ model);
            System.out.println("batteryLevel:"+batteryLevel);
            System.out.println("currentNetwork:"+currentNetwork);
            System.out.println("chargerType:"+chargerType);
         }
     static void makeACall()
       {
         System.out.println("make a call");
       }
     static void sendAMessage()
         {
            
         System.out.println("send msg to someone");
          }
     static void browse()
       {
         
         System.out.println("browse internet");
         }
}