
import java.util.Scanner;
class Addtion
{
	
	public static void main(String[] args) 
	{  

	   /// Question 1
		// Scanner add =new Scanner(System.in);
		// System.out.print("My First number :");
		// int a = add.nextInt();
		// System.out.print("My Second number :");
		// int b =add. nextInt();

 		// System.out.println("Total value is ="+(a+b));

 		//question 2

 		// Scanner vote =new Scanner(System.in);

 		// System.out.print("My age :");
 		// int a = vote.nextInt();
 		

 		// String res = (a>=18)?"Eligible  for vote ":" not Eligible  for vote ";
 		//  System.out.println(res);


 		


        //Question 3

        // Scanner check =new Scanner(System.in);
        // System.out.print("Enter the number :");
        // int num= check.nextInt();
        //  String res=(num%2==0)?"Number is Even":"Number is Odd";
        //  System.out.println(res);



//Question 4

		
        // Scanner multi =new Scanner(System.in);
        // System.out.print("Enter number :");
        // int num= multi.nextInt();
        // String res=(num%3==0)?"Number is Multiply of 3":"Number is not Multiply of 3";
        // System.out.println(res);

 //Questino 5

		// Scanner upper = new Scanner(System.in);
		// System.out.print("Enter the Letter:");
		// char  letter = upper.next().charAt(0);
		// String res = 
		// (letter>='A' && letter <= 'Z')?"Letter is Uppercase"
		// :((letter>='a'&& letter<='z')?"Letter is Lowercase":"It's a Number");

		// System.out.println(res);


		//Question 6

				 Scanner details = new Scanner(System.in);
				 System.out.print("Enter the Name :");
				 String name= details.nextLine();
				 System.out.print("Enter the Roll Number :");
				 int roll=details.nextInt();
				 System.out.print("Enter the Collage Name : ");
				 char collage=details.next().charAt(0);
				 System.out.print("Enter the Gender :");
				 char gender=details.next().charAt(0);
				 System.out.print("Enter the phone number :");
				 long phone=details.nextLong();


		System.out.println("My Name is "+ name);
		System.out.println("My Roll number is "+roll);
		System.out.println("my collage name is "+collage);
		System.out.println("and gender is "+ gender);
		System.out.println("My Phone number is "+phone);

	}
	
}