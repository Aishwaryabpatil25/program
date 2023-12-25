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
     System.out.println("PlantName:"+plantName);
         }
     
      
     Plant(String plantName,String plantFamily)
       { 
        this("Bambusoideae",600);
        
        System.out.println("PlantName:"+plantName);
        System.out.println("PlantFamily:"+plantFamily);
        }
     
     Plant(String plantFamily,int plantdensityOfGrowth)
      {
        System.out.println("PlantFamily:"+plantFamily);
        System.out.println("PlantdensityOfGrowth:"+plantdensityOfGrowth);
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