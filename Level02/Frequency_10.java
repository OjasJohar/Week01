import java.util.Scanner;

public class Frequency_10 {

    public static void main(String[] args) {
		
		//Creating Scanner object
        Scanner input = new Scanner(System.in);

        // Take input for a number
        System.out.print("Enter a number: ");
        long number = input.nextLong();

        // Create an array to store the frequency of digits (0 to 9)
        int[] frequency = new int[10];

        // Find the digits in the number and update the frequency array
        while (number != 0) {
            int digit = (int) (number % 10);  
            frequency[digit]++; 
            number = number / 10;  
        }

        // Display the frequency of each digit
        System.out.println("\nDigit Frequencies:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {  // Only display digits that appear in the number
                System.out.println("Digit " + i + ": " + frequency[i] + " times");
            }
        }

        //Closing Scanner class
		input.close();
    }
}