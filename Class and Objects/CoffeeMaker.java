public class CoffeeMaker
   {
     public static void main(String args[])
       {
        CoffeeMachine obj =  new CoffeeMachine( 50,100,80,"Arabica",true,50);
          obj.display();
          Coffe.brewCoffee();
          
          Coffee.refillWater();
          
          Coffee.grindBeans();
          
  }
}