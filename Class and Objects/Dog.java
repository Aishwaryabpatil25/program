Public class Dog
   {
     String breed;
     int age;
     String color;
     String name;
     String dogType; 


   Dog(String breed,int age,String color,String name,String dogtype)
     {
      this.breed = breed;
      this.age = age;
      this.color=color;
      this.name = name;
      this.dogType = dogType;
     }
 
   public void display()
    {
          System.out.println("breed:"+breed);
           System.out.println("age:"+age);
            System.out.println("color:"+color);
             System.out.println("name:"name);
              System.out.println("dogType:"+dogType);
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