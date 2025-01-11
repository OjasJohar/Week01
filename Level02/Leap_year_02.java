import java.util.Scanner;

public class Leap_Year_02 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Taking the input from user
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        // Ensure the year is >= 1582 and check the leap year conditions in one if
        // statement
        if (year >= 1582 && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is not a Leap Year.");
        }
        input.close();
    }
}