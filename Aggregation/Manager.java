public class Manager extends Company
   {
      int id;
      String type;

    Manager(int id,String type)
     {
       this.id = id;
       this.type = type;
    }


    void conductMeeting()
     {
        System.out.println("manager manages the finance");
     }
 
    void hiring()
     {
         System.out.println("manager hire employees");
     }
}