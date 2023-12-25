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

      public Camera() 
   {
      System.out.println("no parameter");          
    }

      public Camera(String brandName, double price, int resolution, CameraType type, BatteryType batteryType,ChargingType chargingType, DisplayType displayType, int modelYear, String []features) 
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

     
       static void displayCameraInformation(Camera camera) 
        {
        System.out.println("Brand: " + camera.getBrandName());
        System.out.println("Price: $" + camera.getPrice());
        System.out.println("Resolution: " + camera.getResolution() + " MP");
        System.out.println("Type: " + camera.getType());
        System.out.println("Battery Type: " + camera.getBatteryType());
        System.out.println("Charging Type: " + camera.getChargingType());
        System.out.println("Display Type: " + camera.getDisplayType());
        System.out.println("Model Year: " + camera.getModelYear());
        System.out.println("Features: " + camera.getFeatures());
       
    }

      
             




}
