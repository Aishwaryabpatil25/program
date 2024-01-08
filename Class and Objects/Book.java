public class Book
  {
      String title;
       String author;
       int publicationYear;    
       int numberOfPages;
       String type;
       int price;


    Book( String title,String author,int publicationYear,int numberOfPages, String type,int price)
       {
         this.title=title;
         this.author = author;
         this.publicationYear = publicationYear;
         this.numberOfPages = numberOfPages;
         this.type = type;
         this.price = price;
       }

  public void display()
     {
            System.out.println("title:"+title);
            System.out.println("author:"+author);
            System.out.println("publicationYear"+publicationYear);
            System.out.println("numberOfPages:"+numberOfPages);
            System.out.println("type"+type); 
            System.out.println("price"+price); 

         }

     static void open()
          {
            System.out.println("book is opened");
            
           }

      static void close()
          {
           System.out.println("book is closed");
          }
             
      static void read()
           {
               System.out.println("reading book");
                
       }
    }


