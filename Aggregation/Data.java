public class Data extends It
  {
     String type;
     int noOfData;
     Data()
      {
      }
     Data(String type,int noOfData)
      {
        this.type = type;
        this.noOfData = noOfData ;
      }
 
    void generateReport()
      {
        System.out.println("generate report");
      }
 
    void operations()
      {
        System.out.println("perform operation");
      }
}
     