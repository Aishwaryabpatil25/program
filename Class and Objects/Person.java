public class Person
{
   String name;
   int age;
   String address;
   String gender;
   String color;

    Person(String name,int age,String address,String gender,String color)
     {
      this.name = name;
      this.age = age;
      this.address = address;
      this.gender = gender;
      this.color = color;
    }

    public void display()
        {
          System.out.println("name: "+name);
          System.out.println(" age:"+age);
          System.out.println("address: "+address);
          System.out.println("gender:"+gender  );
          System.out.println(" color:"+color);
        }

    static void eat()
     {
      System.out.println(" person is eating food");
      }

     static void sleep()
        {
      System.out.println(" person is sleeping ");
       }     
    static void talk()
         {
           
      System.out.println(" person is talking");
         }

}