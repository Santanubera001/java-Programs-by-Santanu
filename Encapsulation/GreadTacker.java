/*2. Student Grade Tracker
Create a Student class with the following private fields: studentId, name, and marks.
	•	Provide setters with validation (e.g., marks should be between 0 and 100).
	•	Provide getters to retrieve data.
	•	Create another class to create a Student object and set data using setters, then print using getters.
 */

class Student
{
    private int studentId;
    private String name;
    private double marks;

    public  int getStudentId()  //Getter
    {
       return studentId;
    }
    public String getName()    //gatter
    {
        return name;
    }
    public double  getMarks()    //gatter
    {
        return marks;
    }

    public  void setStudentID(int studentId)  //Setter
    {
       this.studentId=studentId;
    }
    public void setName( String name)    //Setter
    {
        this.name=name;
    }
    public void   setMarks(double marks)    //Setter
    {   if(marks>=0 && marks<=100)
         this.marks=marks;
         else
            System.out.println("Not valid marks");
    }
}

public class GreadTacker 
{
     public static void main(String[] args) 
     { 
        Student s=new  Student();
       s.setStudentID(10001);
       s.setName("Santanu");
       s.setMarks(90);
       System.out.println("StudentId is :"+s.getStudentId());
       System.out.println("Name of the Student is :"+s.getName());
       System.out.println("Marks is :"+s.getMarks());
        
     }
}
