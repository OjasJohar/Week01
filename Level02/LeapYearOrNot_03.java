import java.util.Scanner;

public class LeapYearOrNot_03 {

    // method to find the result
    public static boolean findingLeapYear(int year) {

        //Determing wheather the year is leap year or not
        if (year >= 1582 && (year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Taking input from the user in year variable
        System.out.println("Enter the year: ");
        int year = input.nextInt();
        if(year<1582){
            System.out.println("The year should be greater than 1581, corresponding to a year in the Gregorian calendar.");
            System.exit(0);
        }

        //calling function findingLeapYear
        boolean leap=findingLeapYear(year);

        if(leap==true){
            System.out.println("This Year is a Leap Year.");
        }
        else if(leap==false){
            System.out.println("This Year is not a Leap Year.");
        }
		//Closing the Scanner class
        input.close();
    }
}