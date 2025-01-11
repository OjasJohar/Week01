import java.util.Scanner;

public class Leap_Year_01{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        // Calculating whether a year is leap year or not
        if (year < 1582) {
            System.out.println("Year must be greater than or equal to 1582.");
        } else {
            // Check if the year is divisible by 4
            if (year % 4 == 0) {
                // Check if the year is divisible by 100
                if (year % 100 == 0) {
                    // Check if the year is divisible by 400
                    if (year % 400 == 0) {
                        System.out.println(year + " is a Leap Year.");
                    } else {
                        System.out.println(year + " is not a Leap Year.");
                    }
                } else {
                    System.out.println(year + " is a Leap Year.");
                }
            } else {
                System.out.println(year + " is not a Leap Year.");
            }
        }
        input.close();
    }
}