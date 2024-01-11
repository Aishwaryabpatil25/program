public class CompanyStart
   {
     public static void main(String args[])
{
     Employee employee = new Employee(451,"aishupatil@gmail.com");
     
     Manager manager = new Manager(509,"HighLevelManager");
     
     Company company = new Company("TCS","Bangalore",employee,manager);
 
     company.work();  
  
     System.out.println("__________________________________");    

     company.employee.problemSolving();
     company.manager.conductMeeting();

     System.out.println("__________________________________");

     Accounting  accounting = new  Accounting(10000,5);

     Quality quality = new Quality(5,true);
  
 
     Bpo bpo = new Bpo(21,true,accounting,quality);
     bpo.accounting.processInvoice();

    

     Bpo obj = new Bpo(22,false,accounting,quality);
     obj.quality.qualityCheck();
   
     System.out.println("__________________________________");

     Software software = new Software(true,"xyz");

     Data data = new Data("abc",10);

     It it = new It(50,10,software,data);
     it.software.creationOfSoftwareProduct();

     It obj1 = new It(60,20,software,data);
     obj1.data.generateReport();
    

  }
}
