public class MobileStart
     {
       public static void main(String args[])
         {
           Mobile obj = new Mobile("xiaomi","Android",90,5,"ctype",19000);
               obj.display();

               Mobile.makeACall();
            
               Mobile.sendAMessage();
               
               Mobile. browse();
              

     }
}