public class AirConditioner
{
   
   String brand;
   int powerConsumption;
   String color ;
   int price;
   boolean  isItDualClimate;
   int  warranty;

   AirConditioner(String brand, int powerConsumption, String color , int price, boolean  isItDualClimate,int  warranty)
    {
      this(brand,powerConsumption,color,price,isItDualClimate);
      System.out.println(" 6 no of param");
      this.warranty = warranty;
    }
  
   AirConditioner( String brand, int powerConsumption,String color ,int price,boolean  isItDualClimate)
     {
      this( brand, powerConsumption, color , price);
      System.out.println(" 5 no of param");
      this.isItDualClimate = isItDualClimate;
     }
  
   AirConditioner(String brand,int powerConsumption,String color,int price)
     {
      this( brand,powerConsumption, color);
      System.out.println(" 4 no of param");
      this.price = price;
     }
 
    AirConditioner(String brand,int powerConsumption,String color)
      {
        this( brand, powerConsumption);
         System.out.println(" 3 no of param");
         this.color= color;
      }
 
    AirConditioner(String brand,int powerConsumption)
      {
        this( brand);
        System.out.println(" 2 no of param");
        this.powerConsumption = powerConsumption; 
      }
   
    AirConditioner(String brand)
      {
         this();  
         System.out.println(" 1 no of param");
         this.brand = brand;
      }
  
    AirConditioner()
      {
        
         System.out.println(" no of param");
      }


    

public void displayAirConditionerDetails()
    
{

      System.out.println("Brand:" +brand);
      
      System.out.println("PC:" +powerConsumption);
  
      System.out.println("Color:" +color);
 
      System.out.println("Price:" +price);

      System.out.println(" DualClimate:" + isItDualClimate);

      System.out.println(" Warranty:" + warranty);
  }
}
  