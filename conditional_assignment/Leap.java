import java.util.*;

public class Leap {

    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);


        System.out.print("Please enter  year: ");

        int year = s.nextInt();


        if ((year % 400 == 0) || ((year % 100 != 0) && (year % 4 == 0)))

         {

            System.out.println("Yes, " + year + " is a leap year!");

        } else {

            System.out.println("No, " + year + " is NOT a leap year!");
        }
    }
}
