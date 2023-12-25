public class CameraRunner 
    {
    public static void main(String[] args) 
     {
       String [] features={"batteryduration","lenses","dynamicrange","display"};
        
       Camera c1= new Camera("Canon",8000,25,CameraType.DSLR,BatteryType.LITHIUM_ION,ChargingType.USB, DisplayType.OLED,2023,features);
            c1.displayCameraInformation();

       
       
       

             for(int i=0;i<features.length;i++)
               {
                 System.out.println(features[i]);
               }
            switch(c1.type)
                  {
                 case DSLR:
                        System.out.println("camera is DSLR");
                        break;
                case MIRRORLESS:
                        System.out.println("camera is MIRRORLESS");
                        break;
               case COMPACT:
                        System.out.println("camera is COMPACT");
                        break;
                 case DRONES:
                        System.out.println("camera is DRONES");
                        break;
     }
          

            switch(c1.batteryType)
                  {
                 case LITHIUM_ION:
                        System.out.println("camera is LITHIUM_ION");
                        break;
                case NICKEL_CADMIUM:
                        System.out.println("camera is NICKEL_CADMIUM ");
                        break;
               case NICKEL_METAL_HYDRIDE:

                        System.out.println("camera is NICKEL_METAL_HYDRIDE ");
                        break;
                }
            
                 switch(c1.chargingType)
                  {                                                              
                 case USB:
                        System.out.println("camera is USB");
                        break;

                 case C:

                        System.out.println("camera is C");
                        break;

                        
                case ADAPTER:
                        System.out.println("camera is ADAPTER ");
                        break;
                 case WIRELESS:

                        System.out.println("camera is WIRELESS ");
                        break;

                }
           
                 switch(c1.displayType)
                  {                                                              
                 case LCD:
                        System.out.println("camera is LCD");
                        break;

                 case OLED:

                        System.out.println("camera is OLED");
                        break;

                        
                case DUALDISPLAY:                                                  
                        System.out.println("camera is DUALDISPLAY ");
                        break;
                 case FULLSCREEN:

                        System.out.println("camera is FULLSCREEN ");
                        break;

      } 
         System.out.println("_____________________________________________________");

     Camera c2= new Camera("sony",7000,35,CameraType.MIRRORLESS,BatteryType.NICKEL_CADMIUM,ChargingType.C,DisplayType.LCD,2021,features);
            c2.displayCameraInformation();
          for(int i=0;i<features.length;i++)
               {
                 System.out.println(features[i]);
               }
                    switch(c2.type)
                  {
                 case DSLR:
                        System.out.println("camera is DSLR");
                        break;
                case MIRRORLESS:
                        System.out.println("camera is MIRRORLESS");
                        break;
               case COMPACT:
                        System.out.println("camera is COMPACT");
                        break;
                 case DRONES:
                        System.out.println("camera is DRONES");
                        break;
     }
          

            switch(c2.batteryType)
                  {
                 case LITHIUM_ION:
                        System.out.println("camera is LITHIUM_ION");
                        break;
                case NICKEL_CADMIUM:
                        System.out.println("camera is NICKEL_CADMIUM ");
                        break;
               case NICKEL_METAL_HYDRIDE:

                        System.out.println("camera is NICKEL_METAL_HYDRIDE ");
                        break;
                }
            
                 switch(c2.chargingType)
                  {                                                              
                 case USB:
                        System.out.println("camera is USB");
                        break;

                 case C:

                        System.out.println("camera is C");
                        break;

                        
                case ADAPTER:
                        System.out.println("camera is ADAPTER ");
                        break;
                 case WIRELESS:

                        System.out.println("camera is WIRELESS ");
                        break;

                }
           
                 switch(c2.displayType)
                  {                                                              
                 case LCD:
                        System.out.println("camera is LCD");
                        break;

                 case OLED:

                        System.out.println("camera is OLED");
                        break;

                        
                case DUALDISPLAY:                                                  
                        System.out.println("camera is DUALDISPLAY ");
                        break;
                 case FULLSCREEN:

                        System.out.println("camera is FULLSCREEN ");
                        break;

      } 
         System.out.println("_____________________________________________________");



     Camera c3= new Camera("Nikon",6000,30,CameraType.COMPACT,BatteryType.NICKEL_METAL_HYDRIDE,ChargingType.B, DisplayType.DUALDISPLAY,2023,features);
            c3.displayCameraInformation();
                   
                      for(int i=0;i<features.length;i++)
               {
                 System.out.println(features[i]);
               }
                    switch(c3.type)
                  {
                 case DSLR:
                        System.out.println("camera is DSLR");
                        break;
                case MIRRORLESS:
                        System.out.println("camera is MIRRORLESS");
                        break;
               case COMPACT:
                        System.out.println("camera is COMPACT");
                        break;
                 case DRONES:
                        System.out.println("camera is DRONES");
                        break;
     }
          

            switch(c3.batteryType)
                  {
                 case LITHIUM_ION:
                        System.out.println("camera is LITHIUM_ION");
                        break;
                case NICKEL_CADMIUM:
                        System.out.println("camera is NICKEL_CADMIUM ");
                        break;
               case NICKEL_METAL_HYDRIDE:

                        System.out.println("camera is NICKEL_METAL_HYDRIDE ");
                        break;
                }
            
                 switch(c3.chargingType)
                  {                                                              
                 case USB:
                        System.out.println("camera is USB");
                        break;

                 case C:

                        System.out.println("camera is C");
                        break;

                        
                case ADAPTER:
                        System.out.println("camera is ADAPTER ");
                        break;
                 case WIRELESS:

                        System.out.println("camera is WIRELESS ");
                        break;

                }
           
                 switch(c3.displayType)
                  {                                                              
                 case LCD:
                        System.out.println("camera is LCD");
                        break;

                 case OLED:

                        System.out.println("camera is OLED");
                        break;

                        
                case DUALDISPLAY:                                                  
                        System.out.println("camera is DUALDISPLAY ");
                        break;
                 case FULLSCREEN:

                        System.out.println("camera is FULLSCREEN ");
                        break;

      } 
         System.out.println("_____________________________________________________");





     Camera c4= new Camera("Pentax",9000,45,CameraType.DSLR,BatteryType.LITHIUM_ION,ChargingType.USB, DisplayType.OLED,2021,features);
            c4.displayCameraInformation();

                         for(int i=0;i<features.length;i++)
               {
                 System.out.println(features[i]);
               }
                    switch(c4.type)
                  {
                 case DSLR:
                        System.out.println("camera is DSLR");
                        break;
                case MIRRORLESS:
                        System.out.println("camera is MIRRORLESS");
                        break;
               case COMPACT:
                        System.out.println("camera is COMPACT");
                        break;
                 case DRONES:
                        System.out.println("camera is DRONES");
                        break;
     }
          

            switch(c4.batteryType)
                  {
                 case LITHIUM_ION:
                        System.out.println("camera is LITHIUM_ION");
                        break;
                case NICKEL_CADMIUM:
                        System.out.println("camera is NICKEL_CADMIUM ");
                        break;
               case NICKEL_METAL_HYDRIDE:

                        System.out.println("camera is NICKEL_METAL_HYDRIDE ");
                        break;
                }
            
                 switch(c4.chargingType)
                  {                                                              
                 case USB:
                        System.out.println("camera is USB");
                        break;

                 case C:

                        System.out.println("camera is C");
                        break;

                        
                case ADAPTER:
                        System.out.println("camera is ADAPTER ");
                        break;
                 case WIRELESS:

                        System.out.println("camera is WIRELESS ");
                        break;

                }
           
                 switch(c4.displayType)
                  {                                                              
                 case LCD:
                        System.out.println("camera is LCD");
                        break;

                 case OLED:

                        System.out.println("camera is OLED");
                        break;

                        
                case DUALDISPLAY:                                                  
                        System.out.println("camera is DUALDISPLAY ");
                        break;
                 case FULLSCREEN:

                        System.out.println("camera is FULLSCREEN ");
                        break;

      } 
         System.out.println("_____________________________________________________");






    Camera c5= new Camera("Panasonic",9000,30,CameraType.COMPACT,BatteryType.LITHIUM_ION,ChargingType.C, DisplayType.LCD,2022,features);
            c5.displayCameraInformation();
   

                  for(int i=0;i<features.length;i++)
               {
                 System.out.println(features[i]);
               }
                    switch(c5.type)
                  {
                 case DSLR:
                        System.out.println("camera is DSLR");
                        break;
                case MIRRORLESS:
                        System.out.println("camera is MIRRORLESS");
                        break;
               case COMPACT:
                        System.out.println("camera is COMPACT");
                        break;
                 case DRONES:
                        System.out.println("camera is DRONES");
                        break;
     }
          

            switch(c5.batteryType)
                  {
                 case LITHIUM_ION:
                        System.out.println("camera is LITHIUM_ION");
                        break;
                case NICKEL_CADMIUM:
                        System.out.println("camera is NICKEL_CADMIUM ");
                        break;
               case NICKEL_METAL_HYDRIDE:

                        System.out.println("camera is NICKEL_METAL_HYDRIDE ");
                        break;
                }
            
                 switch(c5.chargingType)
                  {                                                              
                 case USB:
                        System.out.println("camera is USB");
                        break;

                 case C:

                        System.out.println("camera is C");
                        break;

                        
                case ADAPTER:
                        System.out.println("camera is ADAPTER ");
                        break;
                 case WIRELESS:

                        System.out.println("camera is WIRELESS ");
                        break;

                }
           
                 switch(c5.displayType)
                  {                                                              
                 case LCD:
                        System.out.println("camera is LCD");
                        break;

                 case OLED:

                        System.out.println("camera is OLED");
                        break;

                        
                case DUALDISPLAY:                                                  
                        System.out.println("camera is DUALDISPLAY ");
                        break;
                 case FULLSCREEN:

                        System.out.println("camera is FULLSCREEN ");
                        break;

      } 
         System.out.println("_____________________________________________________");







    Camera c6= new Camera("Olympus",5000,15,CameraType.DSLR,BatteryType.LITHIUM_ION,ChargingType.C, DisplayType.LED,2023,features);
            c6.displayCameraInformation();

                   for(int i=0;i<features.length;i++)
               {
                 System.out.println(features[i]);
               }
                    switch(c6.type)
                  {
                 case DSLR:
                        System.out.println("camera is DSLR");
                        break;
                case MIRRORLESS:
                        System.out.println("camera is MIRRORLESS");
                        break;
               case COMPACT:
                        System.out.println("camera is COMPACT");
                        break;
                 case DRONES:
                        System.out.println("camera is DRONES");
                        break;
     }
          

            switch(c6.batteryType)
                  {
                 case LITHIUM_ION:
                        System.out.println("camera is LITHIUM_ION");
                        break;
                case NICKEL_CADMIUM:
                        System.out.println("camera is NICKEL_CADMIUM ");
                        break;
               case NICKEL_METAL_HYDRIDE:

                        System.out.println("camera is NICKEL_METAL_HYDRIDE ");
                        break;
                }
            
                 switch(c6.chargingType)
                  {                                                              
                 case USB:
                        System.out.println("camera is USB");
                        break;

                 case C:

                        System.out.println("camera is C");
                        break;

                        
                case ADAPTER:
                        System.out.println("camera is ADAPTER ");
                        break;
                 case WIRELESS:

                        System.out.println("camera is WIRELESS ");
                        break;

                }
           
                 switch(c6.displayType)
                  {                                                              
                 case LCD:
                        System.out.println("camera is LCD");
                        break;

                 case OLED:

                        System.out.println("camera is OLED");
                        break;

                        
                case DUALDISPLAY:                                                  
                        System.out.println("camera is DUALDISPLAY ");
                        break;
                 case FULLSCREEN:

                        System.out.println("camera is FULLSCREEN ");
                        break;

      } 
         System.out.println("_____________________________________________________");




  }
}       




