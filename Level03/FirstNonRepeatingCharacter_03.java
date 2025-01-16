import java.util.Scanner;

public class FirstNonRepeatingCharacter_03 {

    // Method to find the first non-repeating character in a string
    public static char findFirstNonRepeatingCharacter(String str) {
        // Create an array to store the frequency of each character (256 for all ASCII characters)
        int[] freq = new int[256]; // ASCII size is 256

        // Loop through the string and count the frequency of each character
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            freq[currentChar]++; // Increment the frequency at the index corresponding to the character's ASCII value
        }

        // Loop through the string again to find the first non-repeating character
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (freq[currentChar] == 1) {
                return currentChar; // Return the first non-repeating character
            }
        }

        // If there are no non-repeating characters, return a special character (could be '-')
        return '-';
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter a string: ");
        String text = input.nextLine();

        // Find the first non-repeating character
        char result = findFirstNonRepeatingCharacter(text);

        // Display the result
        if (result != '-') {
            System.out.println("The first non-repeating character is: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }

        input.close();
    }
}