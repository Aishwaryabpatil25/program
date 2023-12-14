

//1. printing in reverse

public class StudentArray
{
public static void main(String [] args)
{
    int [] rollNo ={1,2,3,4,5,6,7,8};
    for (int i = rollNo.length-1; i >= 0; i--) 
     {
        System.out.println(rollNo[i]);
     }



//2. printing from middle -> both ways 


    int mid =rollNo.length/2;
    for(int i=mid-1;i>=0;i--)
      {
          System.out.println(rollNo[i]);
      }
    for(int i=mid;i<rollNo.length;i++)
      {
         System.out.println(rollNo[i]);
      }



//3.print only even


     for(int i=0;i<rollNo.length;i++)
        {
          if(i%2==0)
           { 
              System.out.println(rollNo[i]);
           }
        }


//4. print only odd

     for(int i=0;i<rollNo.length;i++)
         {
            if(i%2!=0)
             { 
                System.out.println(rollNo[i]);
              }
          }


//5. sum of all elements in an array

       int sum=0;
       for(int i=0;i<rollNo.length;i++)
          {
              sum=sum+rollNo[i];
          }
           System.out.println(sum);
    }
 }
