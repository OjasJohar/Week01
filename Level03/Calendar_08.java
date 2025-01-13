import java.util.Scanner;

public class Calendar_08 {

    // Array containing month names
    static String[] months = {
        "January", "February", "March", "April", "May", "June",
        "July", "August", "September", "October", "November", "December"
    };

    // Array containing the number of days in each month (index 0 to 11 corresponds to Jan to Dec)
    static int[] daysInMonth = {
        31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
    };

    // Method to get the name of the month
    public static String getMonthName(int month) {
        return months[month - 1];
    }

    // Method to check if the year is a leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Method to get the number of days in the month, considering leap years for February
    public static int getDaysInMonth(int month, int year) {
        // If February and it's a leap year, return 29
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return daysInMonth[month - 1]; // Return days for all other months
    }

    // Method to calculate the first day of the month using the Gregorian calendar algorithm
    public static int getFirstDayOfMonth(int month, int year) {
        int y = year;
        int m = month;
        if (m < 3) {
            m += 12;
            y -= 1;
        }

        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (1 + x + 31 * m0 / 12) % 7;

        return d0; // Return the day of the week (0 = Sunday, 1 = Monday, etc.)
    }

    // Method to print the calendar for a given month and year
    public static void printCalendar(int month, int year) {
        String monthName = getMonthName(month);
        int daysInThisMonth = getDaysInMonth(month, year);
        int firstDay = getFirstDayOfMonth(month, year);

        // Print the month and year
        System.out.println("\n" + monthName + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // Print leading spaces for the first week (based on the first day)
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    "); // Print spaces for the days before the first of the month
        }

        // Print the days of the month
        for (int day = 1; day <= daysInThisMonth; day++) {
            System.out.printf("%3d ", day);
            if ((firstDay + day) % 7 == 0) {
                System.out.println(); // Move to the next line after Saturday
            }
        }

        System.out.println(); // Print a newline after the calendar
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the month and year
        System.out.print("Enter the month (1-12): ");
        int month = scanner.nextInt();

        System.out.print("Enter the year: ");
        int year = scanner.nextInt();

        // Print the calendar
        printCalendar(month, year);

        scanner.close();
    }
}