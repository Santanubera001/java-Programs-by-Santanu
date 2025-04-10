class Book
{
     String name;
     double price;
     String author;
     int quantity;
     int  yearOfPublish;

     Book()
     { 

     }
     Book(String name)
     {
       this();
       this.name=name;
     }
     Book(String name,double price)
     {
     this(name);
     this.price=price;

     }
     Book(String name,double price,String author)
     {
        this(name, price);
        this.author=author;

     }
     Book(String name,double price,String author,int quantity)
     {
       this(name, price, author);
       this.quantity=quantity;
     }

     Book(String name,double price,String author,int quantity,int yearOfPublish)
     {
         this(name, price, author, quantity);
         this.yearOfPublish=yearOfPublish;
     }
      public void  dispalyBookDetails()
      {
            System.out.println("Name os the  book : "+name);
            System.out.println("Price of the book : "+price);
            System.out.println("Author of the book : "+author);
            System.out.println("quintity of the book : "+quantity);
            System.out.println("yearof the book publish : "+yearOfPublish);
            System.out.println("----------");
      }

}
public  class BookDriver
 {
    public static void main(String[] args)
     {
         Book b1=new Book();
         Book b4=new Book("Python");
         Book  b5=new Book("Java",800d,"Herbert Schildt",5,2011);
         b1.dispalyBookDetails();
         b4.dispalyBookDetails();
         b5.dispalyBookDetails();
         
    }
    
}
