/*Write a Program to Create a Student Classb With Fields Like studentName,StudentRollNumber ,StudentPhoneNumber,StudentAddress,
StudentEmail,StudentGender and StudentPrinciple.Create three object with diifferent details and Print it.*/
class StudentDetails
{
    String StudentName;
    int RollNO;
    long PhoneNumber;
    String Address;
    String Email;
    String Gender;

   public void studentDetails()
   {
      System.out.println("Student Name is : "+StudentName);
      System.out.println("Student Roll number is :"+RollNO);
      System.out.println("Student Phone Number is :"+PhoneNumber);
      System.out.println("Student Address is :"+Address);
      System.out.println("Student Email is :"+Email);
      System.out.println("Gender is :"+Gender);
   }
}
   
class StudentDetails1
{
   public static void student()
   {
        String studentPrinciple="SKR";
        System.out.println("The Principle Name is : "+ studentPrinciple);
   }
}

public class Student
 {
    public static void main(String[] args)
     {
        StudentDetails FirstYear=new StudentDetails();
        FirstYear.StudentName="Santanu";
        FirstYear.RollNO=03;
        FirstYear.PhoneNumber=813342145533l;
        FirstYear.Address="Panskura";
        FirstYear.Email="Santanu0646@gmail.com";
        FirstYear.Gender="Male";
        FirstYear.studentDetails();
        StudentDetails1.student();
        System.out.println("--------------------------");
        StudentDetails SecondYear=new StudentDetails();
        SecondYear.StudentName="Gourav";
        SecondYear.RollNO=05;
        SecondYear.PhoneNumber=89075659553l;
        SecondYear.Address="New Town";
        SecondYear.Email="Gourav456@gmail.com";
        SecondYear.Gender="Male";
        SecondYear.studentDetails();
        StudentDetails1.student();
        System.out.println("--------------------------");
        StudentDetails ThirdYear=new StudentDetails();
        ThirdYear.StudentName="Sweety";
        ThirdYear.RollNO=8;
        ThirdYear.PhoneNumber=910174602555l;
        ThirdYear.Address="Kolkata";
        ThirdYear.Email="sweety467@gmail.com";
        ThirdYear.Gender="FeMale";
        ThirdYear.studentDetails();
        StudentDetails1.student();
    }
}
