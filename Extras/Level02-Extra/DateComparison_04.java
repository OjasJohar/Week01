import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateComparison_04 {
	
    public static void main(String[] args) {
		//Creating Scanner object
        Scanner scanner = new Scanner(System.in);

        // Input first date
        System.out.print("Enter the first date (yyyy-MM-dd): ");
        String firstDateInput = scanner.nextLine();

        // Input second date
        System.out.print("Enter the second date (yyyy-MM-dd): ");
        String secondDateInput = scanner.nextLine();

        // Parse the input strings to LocalDate
        LocalDate firstDate = LocalDate.parse(firstDateInput, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        LocalDate secondDate = LocalDate.parse(secondDateInput, DateTimeFormatter.ofPattern("yyyy-MM-dd"));

        // Compare the two dates
        if (firstDate.isBefore(secondDate)) {
            System.out.println("The first date is before the second date.");
        } else if (firstDate.isAfter(secondDate)) {
            System.out.println("The first date is after the second date.");
        } else if (firstDate.isEqual(secondDate)) {
            System.out.println("The first date is the same as the second date.");
        }
    }
}