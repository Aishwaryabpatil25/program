public class Function
   {
    public static void main(String args[])
      {
         String greeting = "good morning";
           char[] value = greeting.toCharArray();
              for(int i=value.length-1;i>=0;i--)
                {
                   System.out.println(value[i]);
                }
              Function obj = new Function();
              
              int res=obj.comp(value,'o');
              System.out.println("Occurence:"+res);
            
               }


           int comp(char[] value,char ch)
           {
           int count=0;
           for(int i=0;i<value.length;i++)
            {
                if(value[i] == ch)
                 {
                    count++;
                 }
                 
            }  
            return count;

        }
    
}