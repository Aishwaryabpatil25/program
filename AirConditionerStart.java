public class AirConditionerStart
   {

    public static void main(String args[])
    
     {
    
        AirConditioner AC = new AirConditioner ("LG",100,"pink",45000,true,2);
        AC.displayAirConditionerDetails();

        System.out.println("---------------------------------------------");
        
        AirConditioner AC1 =  new AirConditioner ("Sony",400,"white",70000,false);
        AC1.displayAirConditionerDetails();
      
            System.out.println("---------------------------------------------");
        
        AirConditioner AC2 = new AirConditioner ("Samsung",600,"black",99000);
        AC2.displayAirConditionerDetails();
      
            System.out.println("---------------------------------------------");
        
        AirConditioner AC3 = new AirConditioner ("Hitachi",800,"grey");
         AC3.displayAirConditionerDetails();

            System.out.println("---------------------------------------------");
        
        AirConditioner AC4 = new AirConditioner ("Panasonic",450);
        AC4.displayAirConditionerDetails();
       
            System.out.println("---------------------------------------------");
        
        AirConditioner AC5 = new AirConditioner ("Godrej");
        AC5.displayAirConditionerDetails();

            System.out.println("---------------------------------------------");

        
        
        
     
        
     
       
    
        
 
        
   }

}