public class Student
  {
    int rollNo;
    char grades;
    String attendance;
    String name;
    String address;
    String course;

    Student(int rollNo,char grades,String attendance,String name,String address,String course)
         {
           this.rollNo = rollNo;
           this.grades = grades;
           this.attendance = attendance;
           this.name = name;
           this.address = address;
           this.course = course;

         }

    public void display()
       {
            System.out.println("rollNo:"+rollNo);
            System.out.println("grades:"+grades);
            System.out.println("attendance :"+attendance );
            System.out.println("name:"+name);                System.out.println("address:"+address);
            System.out.println("course:"+course);
       
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
    