public class CollegeStart
{
   public static void main(String args[])
     {
      System.out.println("static methods");
      College.collegeHistory();
      College. principalDetails();
      College.feesDetails();
      College.uniformDetails();
      College.collegeDetails();
      System.out.println("---------------------------------------------------------------------");
      System.out.println("Non static methods");
      College clg = new College();
      clg.studentDetails();
      clg.sportsDetails();
      clg.workerDetails();
      clg.departmentDetails();
      clg.staffDetails();
  }

}