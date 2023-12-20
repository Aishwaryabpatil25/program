public class Books
{
   String bookName;
   int noOfPages;
   String  author; 
   double  price;
   int  publishedYear;
   String publisher;
   String  type;

    public Books(String bookName,int noOfPages,String  author,double  price,int  publishedYear,String publisher,String  type)
       {
        this.bookName=bookName;
        this.noOfPages=noOfPages;
        this.author=author;
        this.price=price;
        this.publishedYear=publishedYear;
        this.publisher=publisher;
        this.type=type;
       }
      

   public void printBookDetails()
      {
         System.out.println("Book :" +bookName);
         System.out.println("Pages:" +noOfPages);
         System.out.println("Author:" +author);
         System.out.println("Price :" +price);
         System.out.println("Published Year :" +publishedYear);
         System.out.println("Publisher:" +publisher);
         System.out.println("Type:" +type);
        }
   public static void main(String args[])
      {
         Books book1 = new Books("C-Programming",400,"Dennis Ritchie", 30000, 2020, "Prentice Hall", "Programming");

        
         Books book2 = new Books("Java Programming",500,"John Doe", 22000, 2020, "Tech Books Inc", "Programming");
         
         Books book3 = new Books("R-Programming",600,"Kurt Hornik",40000,1997," Allaire","R program");
         
         Books book4 = new Books("Python",560,"Guido van Rossum",10000,1991,"  Python Software Foundation","python");

         Books book5 = new Books("Data Structure",700,"Anuradha Puntambekar",3200,2020," Technical Publications","DS");

         Books book6 = new Books("Data Science",600,"Jane Smith", 20000, 2021, "DataTech Publishing", "Data Science");

         Books book7  = new Books("Data analyst",300,"Bharti Motwani",25000,1996,"  BCS  ","  Data analyst ");
     

         book1.printBookDetails();

           System.out.println("------------------------------------------------------------------------");
         book2.printBookDetails();
           System.out.println("------------------------------------------------------------------------");

         book3.printBookDetails();
           System.out.println("------------------------------------------------------------------------");

         book4.printBookDetails();
             System.out.println("------------------------------------------------------------------------");

         book5.printBookDetails();
              System.out.println("------------------------------------------------------------------------");

         book6.printBookDetails();
              System.out.println("------------------------------------------------------------------------");

         book7.printBookDetails();
    }
 }
        



