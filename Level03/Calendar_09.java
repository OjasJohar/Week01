import java.util.Scanner;

public class Calendar_09 {

    // Method to get the name of the month
    public static String getMonthName(int month) {
        String[] months = { "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December" };
        return months[month - 1];
    }

    // Method to determine if the year is a leap year
    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        }
        return false;
    }

    // Method to get the number of days in a month
    public static int getNumberOfDays(int month, int year) {
        int[] daysInMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        // Check if the month is February and adjust for leap year
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }

        return daysInMonth[month - 1];
    }

    // Method to get the first day of the month using the Gregorian calendar
    // algorithm
    public static int getFirstDayOfMonth(int month, int year) {
        if (month < 3) {
            month += 12;
            year--;
        }
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (1 + x + 31 * m0 / 12) % 7;

        return d0;
    }

    // Method to display the calendar
    public static void displayCalendar(int month, int year) {
        String monthName = getMonthName(month);
        int numDays = getNumberOfDays(month, year);
        int firstDay = getFirstDayOfMonth(month, year);

        // Display the month and year
        System.out.println("      " + monthName + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // Display spaces for the first day of the month
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    "); // 4 spaces for each day of the week before the first day
        }

        // Display the days of the month
        for (int day = 1; day <= numDays; day++) {
            // Print the day with proper spacing for single-digit days
            if (day < 10) {
                System.out.print("  " + day + " "); // 3 spaces for single-digit days
            } else {
                System.out.print(" " + day + " "); // 2 space for double-digit days
            }

            // Move to the next line after Saturday (end of the week)
            if ((firstDay + day) % 7 == 0) {
                System.out.println(); // Move to the next line after Saturday
            }
        }
        System.out.println(); // Extra line after the calendar is displayed
    }

    // Main method to take user input and display the calendar
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get the month and year from the user
        System.out.print("Enter the month (1-12): ");
        int month = input.nextInt();

        System.out.print("Enter the year: ");
        int year = input.nextInt();

        // Display the calendar for the given month and year
        displayCalendar(month, year);
        input.close();
    }
}