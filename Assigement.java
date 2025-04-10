import java.util.Scanner;
class  Assigement
{
	public static void main(String[] args) 
	{
//Write a program that takes a number (1-7) and prints the corresponding day of the week.
         
      // Scanner week=new Scanner(System.in);

      // System.out.print("entejavar a number");
      // int a=week.nextInt();

      // switch(a)
      // {
      // 	 case 1:
      // 	 	System.out.println("Sunday");
      // 	 	break;

      // 	 case 2:
      // 	 	System.out.println("Monday");
      // 	 	break;

      // 	 case 3:
      // 	 	System.out.println("Tuesday");
      // 	 	break;
      // 	 case 4:
      // 	 	System.out.println("Wednesday");
      // 	 	break;

      // 	 case 5:
      // 	 	System.out.println("Thusday");
      // 	 	break;

      // 	 case 6:
      // 	 	System.out.println("Friday");
      // 	 	break;

      // 	 case 7:
      // 	 	System.out.println("Saturday");
      // 	 	break;
      // }



/*Write a program that takes two numbers and an operator
 (+, -, *, /) and performs the operation.*/
		//  Scanner num=new Scanner(System.in); 
		//  System.out.println("for additon +,for subtraction -,for multipication *,for division /");
		//  char c= num.next().charAt(0);
		//  System.out.print("Enter First a number:");
		//  int a=num.nextInt();
		//  System.out.print("Enter second a number:");
		//  int b=num.nextInt();

   

        // switch(c)
        // {
        //     case '+':
        //     	System.out.println("Addition is"+(a+b));
        //     	break;

        //     case '-':
        //     	System.out.println("subtraction is"+(a-b));
        //     	break;

        //     case '*':
        //     	System.out.println("multipication is"+(a*b));
        //     	break;

        //      case '/':
        //     	System.out.println("division is"+(a/b));
        //     	break;

        //    default:
        //    	   System.out.println("Any Symboll is not allowed");


        // }


//Write a program that checks whether an entered character is a vowel or consonant//
    Scanner alph=new Scanner(System.in);
     System.out.print("Enter alphabat:");
       char c = alph.next().charAt(0);
   switch(c) {
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':
           System.out.println("  It is a vowel.");
            break;

        default:
        	System.out.println("it's a consonant");
}

	}
}