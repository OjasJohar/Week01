import java.util.Scanner;

public class CharacterFrequency_04 {

    // Method to find the frequency of characters using charAt()
    public static String[][] findCharacterFrequency(String str) {
        // Create an array to store the frequency of each character (256 for all ASCII characters)
        int[] freq = new int[256]; // ASCII size is 256

        // Loop through the string and count the frequency of each character
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            freq[currentChar]++; // Increment the frequency at the index corresponding to the character's ASCII value
        }

        // Now, we need to store the character and its frequency in a 2D array
        int uniqueCount = 0;
        
        // Count how many unique characters we have (those with frequency > 0)
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                uniqueCount++;
            }
        }

        // Create a 2D array to store the character and its frequency
        String[][] result = new String[uniqueCount][2];
        int index = 0;

        // Populate the 2D array with characters and their frequencies
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                result[index][0] = String.valueOf((char) i); // Convert ASCII value to char and store it as a string
                result[index][1] = String.valueOf(freq[i]);  // Store the frequency as a string
                index++;
            }
        }

        return result;
    }

    // Method to display the frequency of characters
    public static void displayCharacterFrequency(String[][] frequencyData) {
        System.out.println("Character Frequency:");
        System.out.println("-------------------------");
        for (int i = 0; i < frequencyData.length; i++) {
            System.out.println("Character: " + frequencyData[i][0] + " | Frequency: " + frequencyData[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter a string: ");
        String text = input.nextLine();

        // Find the frequency of characters
        String[][] frequencyData = findCharacterFrequency(text);

        // Display the frequency of characters
        displayCharacterFrequency(frequencyData);

        input.close();
    }
}