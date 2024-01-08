public class Airplane
{
     String aircraftType; 
     String destination;
     int  currentAltitude; 
     int  fuelLevel;
     String seatType;
     boolean isFlying;

    Airplane(String aircraftType,String destination,int  currentAltitude,int  fuelLevel, String seatType,boolean isFlying)
         {
            this.aircraftType = aircraftType;
            this.currentAltitude = currentAltitude;
            this.fuelLevel = fuelLevel;
            this.destination = destination;
            this.seatType = seatType;
            this.isFlying = isFlying;
       }

    public void display()
        {
          System.out.println("aircraftType:" +aircraftType);
          System.out.println("currentAltitude:" +currentAltitude);
          System.out.println("fuelLevel:" +fuelLevel);
          System.out.println("destination:" +destination);
          System.out.println("seatType:" +seatType);
          System.out.println("isFlying:" +isFlying);
         }
       static void takeOff()
            {
             System.out.println("airplane is takeoff");
            }
       static void  land()
           {
             System.out.println("airplane is landed");
           }

      static void  flyToALocation()
             {
             System.out.println("airplane is flying");
           }
}

