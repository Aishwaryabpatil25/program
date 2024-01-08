public class Coffee
  {
   int Waterlevel;
   int coffeeBeanQuantity;
   int temperature;
   String beanType;
   boolean powerOn; 
   int price;
 
   CoffeeMachine(int Waterlevel,int coffeeBeanQuantity,int temperature,int waterLevel,boolean powerOn)
      {
       this. Waterlevel =  Waterlevel;
       this.coffeeBeanQuantity = coffeeBeanQuantity;
       this.temperature = temperature;
       this.waterLevel = waterLevel;
       this.powerOn = powerOn;
       this.price = price;
   }


        public void display()
             {
                System.out.println(" Waterlevel:"+ Waterlevel);
                 System.out.println("coffeeBeanQuantity:"+coffeeBeanQuantity);
                 System.out.println("temperature:"+temperature);
                 System.out.println("waterLevel:"+waterLevel);
                  System.out.println("powerOn:"+powerOn);
                   System.out.println("price:"+price);

            }



         static void brewCoffee()
           {
             System.out.println("brew coffee");
            }           
          static void refillWater()
            {
              System.out.println("water in coffee refills");
            }
          static void grindBeans()
            {
              
              system.out.println("beans are grinded");
            }
}