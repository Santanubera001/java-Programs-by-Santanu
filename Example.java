
import java.util.Scanner;

class Example{

    public static int growth_plant(int year) {
        int firstyear = 0;
        int secondyear = 1;

        if (year == 0) {
            return 0;
        } else if (year == 1) {
            return 1;
        } else {
            int newyear = 0;
            for (int i = 2; i <= year; i++) {
                newyear = firstyear + secondyear;
                // System.out.println(" "+newyear);
                firstyear = secondyear;
                secondyear = newyear;
            }
            return newyear;
        }
  }

   

    

    public static void main(String[] args) {

        Scanner growth = new Scanner(System.in);
        System.out.print("Enter the number:");
        int year = growth.nextInt();
        System.out.println(growth_plant(year));
    }
}
