import java.util.Scanner;

public class Calculator
 {
    public static void main(String ar[])
    {      
        calculator();

    }
    public static void calculator()
    { Scanner sc= new Scanner(System.in);
        char in; boolean val=true;
        while(val)
        {
            System.out.print("\n Menu ........\n 1: Press '+' for Addition \n 2: Press '-' for Subtraction \n 3: Press '*' for Multiplication \n 4: Press '/' for Division  \n 5: Press 5 to exit \n Enter input: ");
             in = sc.next().charAt(0);
            double result, num1, num2;
            
        switch (in) 
        {
            case '+': 
            System.out.print("Enter first number: "); 
            num1 = sc.nextDouble(); 
            System.out.print("Enter second number: ");
             num2 = sc.nextDouble();
            result = num1 + num2;   System.out.println("Result: " + result); break;
            case '-': 
            System.out.print("Enter first number: "); 
            num1 = sc.nextDouble(); 
            System.out.print("Enter second number: "); 
             num2 = sc.nextDouble();
            result = num1 - num2;  
             System.out.println("Result: " + result);  break;
            case '*': 
            System.out.print("Enter first number: "); 
            num1 = sc.nextDouble(); 
            System.out.print("Enter second number: ");
             num2 = sc.nextDouble();
            result = num1 * num2; 
              System.out.println("Result: " + result); break;
            case '/': 
            System.out.print("Enter first number: ");  
            num1 = sc.nextDouble(); 
            System.out.print("Enter second number: "); 
             num2 = sc.nextDouble();
                if (num2 != 0) { result = num1 / num2;  
                     System.out.println("Result: " + result);}
                else {
                    System.out.println("Error: Division by zero");
                    
                    return;
                }
                break;
            case '5': 
                val=false; break;
            default:
                System.out.println("Invalid Operator");
                return;
            }
        }
    
    }
}


