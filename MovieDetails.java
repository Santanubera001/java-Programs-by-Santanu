
/*Write a program to create a class Movie with fields: name, rating, and year.
 Use constructor to initialize the fields. Create 3 objects and display their details*/

class Movie
{
    String name;
    double rating;
    int year;
  Movie(String name, double rating,int year)
  {
      this.name=name;
      this.rating=rating;
      this.year=year;
  }
  public void display()
  {
   System.out.println("Movie name is :"+name);
   System.out.println("Rating of the movie:"+rating);
   System.out.println("Release year of the movie:"+year);
   System.out.println("------------------");
  }
}
public class MovieDetails
 {
    public static void main(String[] args) 
    {
        Movie m1=new Movie("Puspa",8.3,2024);
        Movie m2=new Movie("12Fail",8.9,2023);
        Movie m3=new Movie("Taqdeer",9.5,2017);
        m1.display();
        m2.display();
        m3.display();
    }
}
