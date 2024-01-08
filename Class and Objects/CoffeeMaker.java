public class CoffeeMaker
   {
     public static void main(String args[])
       {
        CoffeeMaker obj =  new CoffeeMaker(60,100,80,"Arabica",true,50);
          obj.display();
          Coffee.brewCoffee();
          
          Coffee.refillWater();
          
          Coffee.grindBeans();
          
  }
}