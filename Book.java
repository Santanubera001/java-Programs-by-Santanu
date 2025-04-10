/*Create class Book with states BookId,BookName,BookAuthor,BookPrice with behabiour Print details (Methods)
 Create five object of Book and Store diiferent details and Print*/
class BookDetails
{
    int Bookid;
    String BookName;
    String  BookAuthor; 
    int Price;
     public  void details()
     {
       System.out.println("This Is my Five Book Details");    
    
     }
}
public class Book
 {
    public static void main(String[] args)
     {
      BookDetails b1= new  BookDetails();
      b1.Bookid=10;
      b1.BookName="Java";
      b1.BookAuthor="Herbert Schildt";
      b1.Price=1000;
      b1.details();
    System.out.println("------------------------");
    System.out.println("First Book details");
    System.err.println("BookId  is : "+ b1.Bookid);
    System.out.println("Book Author Name is :"+b1.BookAuthor);
    System.out.println("Book Name is :"+b1.BookName);
    System.out.println("Book Price is : "+b1.Price);
  
    System.out.println("-------------------------------------");

    System.out.println("Second  Book details");   
      BookDetails b2= new  BookDetails();
      b2.Bookid=20;
      b2.BookName="Pyhton";
      b2.BookAuthor="Guido van Rossum.";
      b2.Price=800;
    System.err.println("BookId is : "+ b2.Bookid);
    System.out.println("Book Author Name is :"+b2.BookAuthor);
    System.out.println("Book Name is :"+b2.BookName);
    System.out.println("Book Price is : "+b2.Price);

    System.out.println("-------------------------------------");
    System.out.println("Third Book details");   
      BookDetails b3= new  BookDetails();
      b3.Bookid=30;
      b3.BookName="SQL";
      b3.BookAuthor="Walter Shields";
      b3.Price=850;
    System.err.println("BookId is  : "+ b3.Bookid);
    System.out.println("Book Author Name is :"+b3.BookAuthor);
    System.out.println("Book Name is :"+b3.BookName);
    System.out.println("Book Price is : "+b3.Price);

    System.out.println("-------------------------------------");
    System.out.println("Fourth Book details");   
      BookDetails b4= new  BookDetails();
      b4.Bookid=40;
      b4.BookName="JavaScript";
      b4.BookAuthor="Brendan Eich ";
      b4.Price=700;
    System.err.println("BookId is : "+ b4.Bookid);
    System.out.println("Book Author Name is :"+b4.BookAuthor);
    System.out.println("Book Name is :"+b4.BookName);
    System.out.println("Book Price is : "+b4.Price);

    System.out.println("-------------------------------------");
    System.out.println("Fifth Book details");   
      BookDetails b5= new  BookDetails();
      b5.Bookid=50;
      b5.BookName="SDLC";
      b5.BookAuthor="Herbert Benington ";
      b5.Price=700;
    System.err.println("BookId is : "+ b5.Bookid);
    System.out.println("Book Author Name is :"+b5.BookAuthor);
    System.out.println("Book Name is :"+b5.BookName);
    System.out.println("Book Price is : "+b5.Price);
    } 
}



