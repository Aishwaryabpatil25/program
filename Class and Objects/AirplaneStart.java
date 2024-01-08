public class AirplaneStart
    {
       public static void main(String args[])
         {
         Airplane obj =  new Airplane("Boeing","goa",4000,80,"EconomyClass",true);
          obj.display();
          
          Airplane.takeOff();
          Airplane .land();
          Airplane.flyToALocation();
             
        }
}

