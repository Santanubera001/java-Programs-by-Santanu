class Condition{
	public static void main(String[] args) {
		// int myage=21;
		// int votingage=18;

		// if(myage>=votingage){
		// 	System.out.println("Age is enough to vote!");
		// }
	    // else{
	    // 	System.out.println("Age is not eligeble for vote");
	    
		// }

     // int time=15;
     // if(time<10){
     // 	System.out.println("Morning");
     // }
     // else if(time<20){
     // 	System.out.println("Evening");
     // }
     // else{
     // 	System.out.println("Night");
     // }




// int day=10;
// switch(day){
// 	case 1:
// 		System.out.println("Monday");
// 		break;
// 	case 2:
// 		System.out.println("Tuesday");
// 		break;
// 	case 3:
// 		System.out.println("Wednesday");
// 		break;
// 	case 4:
// 		System.out.println("Thursday");
// 		break;
// 	case 5:
// 		System.out.println("Friday");
// 		break;
// 	case 6:
// 		System.out.println("Saturday");
// 		break;
// 	case 7:
// 		System.out.println("Sunday");
// 		break;
// 	default:
// 		System.out.println("It's a weeekend plan");
// }


// int num =3;
//   String res = num%2==0? "num is even":"num is odd";
//  System.out.println(res);

// int num1=23;
// int num2=34;

// String res =(num1>num2)?"num1 is greater":"num2 is greater";
//  System.out.println(res);

//greatest of three number//
	// int num1=5;
	// int num2=6;
	// int num3=4;

	// String res=(num1>num2 && num1>num3)? "num1 is greater":(num2>num3 ? "num2 is greater":"num3 is greater");
    // System.out.println(res);


/*Write a program to check weather a triangle
 is quilsatial,issosceles,scalence in java by ternary operator*/

int a=4;
int b=4;
int c=4;
String res = (a==b && b==c)?"Equilateral":(a==b || b==c || a==c)?"Issosceles":"Scalence";
System.out.println(res);


	}
}