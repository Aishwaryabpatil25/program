public class Plant
{
    String plantName;
    String plantFamily;
    int plantdensityOfGrowth;
    
    Plant()
      {
      this("Bamboo");
      System.out.println(" plant no param constructor");
      }
     
     Plant(String plantName)
     {
     this("Bamboo","Bambusoideae");
     System.out.println(plantName);
         }
     
      
     Plant(String plantName,String plantFamily)
       { 
        this("Bambusoideae",600);
        
        System.out.println(plantName);
        System.out.println(plantFamily);
        }
     
     Plant(String plantFamily,int plantdensityOfGrowth)
      {
        System.out.println(plantFamily);
        System.out.println(plantdensityOfGrowth);
      }
    

     Plant( String plantName,String plantFamily,int plantdensityOfGrowth)
      {
       this.plantName = plantName;
       this.plantFamily = plantFamily;
       this.plantdensityOfGrowth = plantdensityOfGrowth;
      
      } 
      
    
     
   public static void main(String args[])
    {
       Plant plant1 = new Plant();
      

     }
  }