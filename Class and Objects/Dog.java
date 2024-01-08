public class Dog
   {
     String breed;
     int breedSize;
     String color;
     String name;
     String dogType; 
     int year;


   Dog(String breed,int breedSize,String color,String name,String dogtype,int year)
     {
      this.breed = breed;
      this.breedSize = breedSize;
      this.color=color;
      this.name = name;
      this.dogType = dogType;
      this.year = year;
     }
 
   public void display()
    {
            System.out.println("breed:"+breed);
            System.out.println("breedSize:"+breedSize);
            System.out.println("color:"+color);
            System.out.println("name:"+name);
            System.out.println("dogType:"+dogType);
            System.out.println("year:"+year);
     }

  static void bark()
      {
         System.out.println("Dog is barking");
      }

   static void wagTail()
     {
        System.out.println("Dog is wagingtail");
      }
     
  static void fetch()
     {
        System.out.println("Dog is fetching");
      }

}