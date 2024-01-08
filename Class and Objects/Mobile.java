public class Mobile
  {
    String brand;
    String model;
    int batteryLevel;
    int currentNetwork;
    String chargerType;
    int price;
  
   Mobile( String brand,String model,int batteryLevel,int currentNetwork,String chargerType,int price)
         {
         this.brand = brand;
         this.model = model;
         this.batteryLevel = batteryLevel;
         this.currentNetwork = currentNetwork;
         this.chargerType = chargerType;
         this.price = price;
       }


     public void display()
          {
            System.out.println("brand:"+brand);
            System.out.println(" model:"+ model);
            System.out.println("batteryLevel:"+batteryLevel);
            System.out.println("currentNetwork:"+currentNetwork);
            System.out.println("chargerType:"+chargerType);
            System.out.println("price:"+price);
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