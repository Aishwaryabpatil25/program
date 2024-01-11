public class It extends Company
   {
 
      int noOfEmployees;
      int noOfDepartments;
      Software software;
      Data data;
      
   
    It()
     {

     }
   
    It(int noOfEmployees, int noOfDepartments,Software software,Data data)
       {
         this.noOfEmployees = noOfEmployees;
         this.noOfDepartments = noOfDepartments;
         this.software = software;
         this.data = data;
        }

     void performTask()
     {
       System.out.println(" it company perform tasks ");
     }

     void givesTraining()
      {
        System.out.println(" gives training for employee ");
      }
}