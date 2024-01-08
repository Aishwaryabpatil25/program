public class BookStore
  {
   public static void main(String args[])
     {
      Book obj = new Book("three thousand","sudha murthy",2017,128,"novel",150);
       obj.display();
     Book.open();
     Book.close();
     Book.read();
     
  }
}