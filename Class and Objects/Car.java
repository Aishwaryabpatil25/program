public class Car
  {
    
    String model;
    String color;
    int currentSpeed;
    int fuelLevel;
    int price;
    String name;
    



  Car(String model, String color,int currentSpeed,int fuelLevel,int price,String name)
     {
       this.model = model;
       this.color = color;
       this.currentSpeed = currentSpeed;
       this.fuelLevel = fuelLevel;
       this.price = price;
       this.name = name;
      }

  public void display()
   {
       
            System.out.println("model:"+model);
            System.out.println("color:"+color);
            System.out.println("currentSpeed:"+currentSpeed);
            System.out.println("fuelLevel :"+fuelLevel );
            System.out.println("price:"+price);
            System.out.println("name:"+name);
   }

   static void accelerate()
          {
            System.out.println("accelerate the car");
           }

   Static void brake()
             {
            System.out.println("  car brake is good");
           }
     
    static void changeGears()
            {
               System.out.println("  car gear is changed");
             }

}