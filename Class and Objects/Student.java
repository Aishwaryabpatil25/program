public class Student
  {
    int rollNo;
    char grades;
    String attendance;
    String name;
    String address;

    Student(int rollNo,char grades,String attendance,String name,String address)
         {
           this.rollNo = rollNo;
           this.grades = grades;
           this.attendance = attendance;
           this.name = name;
           this.address = address;

         }

    publi void display()
       {
            System.out.println("rollNo:"+rollNo);
             System.out.println("grades:"+grades);
              System.out.println("attendance :"+attendance );
               System.out.println("name:"+name);
                 System.out.println("address:"+address);
       
           }
         static void study()
           {
             System.out.println("student is studying");
           }
         static void attendClasses()
            {
              System.out.println("student is attending class");
            }
        static void submitAssignments()
            {
             System.out.println("student submit the assignments");
             }
}
    