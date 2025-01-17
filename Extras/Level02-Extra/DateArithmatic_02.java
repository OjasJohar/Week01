import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateArithmatic_02 {
    public static void main(String[] args) {
		//Creating Scanner object
        Scanner scanner = new Scanner(System.in);

        // Input date from the user
        System.out.print("Enter a date (yyyy-MM-dd): ");
        String inputDate = scanner.nextLine();

        // Parse the input date
        LocalDate date = LocalDate.parse(inputDate);

        // Perform date arithmetic
        LocalDate updatedDate = date.plusDays(7)       // Add 7 days
                                      .plusMonths(1)   // Add 1 month
                                      .plusYears(2);   // Add 2 years

        LocalDate finalDate = updatedDate.minusWeeks(3); // Subtract 3 weeks

        // Define a formatter for the output
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        // Display the result
        System.out.println("Original Date: " + date.format(formatter));
        System.out.println("After Adding 7 days, 1 month, and 2 years: " + updatedDate.format(formatter));
        System.out.println("After Subtracting 3 weeks: " + finalDate.format(formatter));
    }
}