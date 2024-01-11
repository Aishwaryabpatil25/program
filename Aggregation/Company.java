public class Company
   {
     String name;
     String address;
     Employee employee;
     Manager manager;

   Company()
      {
  
       }
   Company( String name,String address,Employee employee, Manager manager)

     {
        this.name = name;
        this.address = address;
        this.employee = employee;
        this.manager = manager;
    }
     void work()
      {
        System.out.println("company assign work for employee");
       }

    void manage()
      {
         System.out.println("company manages the employee");
      }
}

