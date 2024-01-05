public class Vehical
 {
   public static void main(String args[])
     {
         
         String myStr1 = "";
         boolean isEmpty = myStr1.isEmpty();
         System.out.println(isEmpty);
         System.out.println("   ");
         
    
         String myStr = "       Aishi Patil      ";
         System.out.println(myStr.trim());
         System.out.println(myStr);
         System.out.println("   ");
         
         int value=5;  
         String s1=String.valueOf(value);  
         System.out.println(s1+10);
         System.out.println("   ");
        
         String Str = new String("Welcome to java class");
         String substring = Str.substring(10);
         System.out.println(substring);
         System.out.println("   ");

         String str5 = new String("red pink");
         String replaceFirst = str5.replaceFirst("red", "black");
         System.out.println(replaceFirst);
         System.out.println("   ");

         String str6 = "Aishu";
         String str7 = "aishu";
         boolean isEqualIgnoreCase = str6.equalsIgnoreCase(str7);
         System.out.println(isEqualIgnoreCase);
         System.out.println("   ");

         String str8 = "aish, Patil";
         boolean endsWith = str8.endsWith("Patil");
         boolean startsWith = str8.startsWith("Aish");
         System.out.println(startsWith);
         System.out.println(endsWith);
         System.out.println("   "); 
       
         String str9 = "Aishwarya";
         String upperCase = str9.toUpperCase();
         String lowerCase = str9.toLowerCase();
         System.out.println(upperCase);
         System.out.println(lowerCase);

    }
}
        




















