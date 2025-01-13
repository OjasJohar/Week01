import java.util.Scanner;

public class SpringSeason_06 {

	//Method to determine spring season
	public boolean findSeason(int month, int day) {
		if ((month == 3 && day >= 20) || (month > 3 && month < 6) || (month == 6 && day <= 20)) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		
		//Creating Scanner object
		Scanner input = new Scanner(System.in);

		// Taking user input in month variable
		System.out.println("Enter the Month Number: ");
		int month = input.nextInt();
		while (true) {
			if (month <= 0 && month > 12) {
				System.out.println("Invalid Input, enter the month number again:");
				month = input.nextInt();
			} else {
				break;
			}
		}

		// Taking user input in day variable
		System.out.println("Enter the Date: ");
		int day = input.nextInt();
		while (true) {
			if (day <= 0 && day > 31) {
				System.out.println("Invalid Input, enter the date again:");
				day = input.nextInt();
			} else {
				break;
			}
		}

		// determining whether its spring season or not
		SpringSeason_06 obj = new SpringSeason_06();
		boolean season = obj.findSeason(month, day);

		// printing the output
		if (season == true) {
			System.out.println("It's a Spring Season.");
		} else {
			System.out.println("Not a Spring Season.");
		}

		//Closing Scanner class
		input.close();
	}

}