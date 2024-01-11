public class Employee extends Company
  {
     int empId;
     String gmail;

    
    Employee(int empId,String gmail)
      {
	super();
       this.empId = empId;
       this.gmail = gmail;
      }

    void problemSolving()
     {
       System.out.println("problem sloving");
     }
   void joining()
     {
      System.out.println("joining");
     }
}