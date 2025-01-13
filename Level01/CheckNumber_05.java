import java.util.Scanner;

public class CheckNumber_05 {

	//Method to determine nature of number
	public int findingNature(int number) {

		if (number == 0)
			return 0;
		else if (number > 0)
			return 1;
		else
			return -1;
	}

	public static void main(String[] args) {
		
		//Creating Scanner object
		Scanner input = new Scanner(System.in);

		//Taking user input in number variable
		System.out.println("Enter the Number: ");
		int number = input.nextInt();

		//Checking the number through method
		CheckNumber_05 obj = new CheckNumber_05();
		int nature = obj.findingNature(number);

		//Printing the result
		if (nature == 0) {
			System.out.println("Number is Zero.");
		} else if (nature > 0) {
			System.out.println("Number " + number + " is Positive.");
		} else if (nature < 0) {
			System.out.println("Number " + number + " is Negative.");
		}

		//Closing the Scanner class
		input.close();
	}

}