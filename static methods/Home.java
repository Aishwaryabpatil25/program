public class Home
{
  
   static int number;
   static String homeAddress;
   static String location;
   int noOfRooms;
   int noOfPeople;
   String homeType;
 
     Home( int noOfRooms,int noOfPeople,String homeType)
        {
          this.noOfRooms=noOfRooms;
          this.noOfPeople=noOfPeople;
          this.homeType=homeType;
        }

     static{
           number = 1330;
           homeAddress = "patil";
           location = "gadag";
      }

     static void displayHomeDetails()
       {
         System.out.println("Home Number:" +number);
         System.out.println("Home Address:" +homeAddress); 
         System.out.println("Home Location:" +location);
       }
    public void homeDetails()
       {
         
         System.out.println("Rooms:" +noOfRooms);
         System.out.println("People:" +noOfPeople);
         System.out.println("Type:" +homeType);
       }

}