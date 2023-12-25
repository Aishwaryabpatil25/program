public class Camera
 {
     String brandName;
     int price;
     int resolution;
     CameraType type;
     BatteryType batteryType;
     ChargingType chargingType;
     DisplayType displayType;
     int modelYear;
     String []features;

       Camera() 
   {
      System.out.println("no parameter");          
    }

      Camera(String brandName, int price, int resolution, CameraType type, BatteryType batteryType,ChargingType chargingType, DisplayType displayType, int modelYear, String []features) 
      {
        this.brandName = brandName;
        this.price = price;
        this.resolution = resolution;
        this.type = type;
        this.batteryType = batteryType;
        this.chargingType = chargingType;
        this.displayType = displayType;
        this.modelYear = modelYear;
        this.features = features;
      }

     
       public void displayCameraInformation() 
        {
        System.out.println("Brand: " + brandName);
        System.out.println("Price: " + price);
        System.out.println("Resolution: " + resolution );
        System.out.println("Type: " +type);
        System.out.println("Battery Type: " + batteryType);
        System.out.println("Charging Type: " + chargingType);
        System.out.println("Display Type: " + displayType);
        System.out.println("Model Year: " + modelYear);
        System.out.println("Features: " );
       
    }

 }
