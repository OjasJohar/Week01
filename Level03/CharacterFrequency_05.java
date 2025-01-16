import java.util.Scanner;

public class CharacterFrequency_05 {

    // Method to find unique characters in the string using charAt() and return them as a 1D array
    public static char[] findUniqueCharacters(String str) {
        int length = str.length();
        char[] uniqueChars = new char[length]; // Temporary array to store unique characters
        int uniqueCount = 0; // To keep track of the number of unique characters

        // Loop through the string to find unique characters
        for (int i = 0; i < length; i++) {
            char currentChar = str.charAt(i);
            boolean isUnique = true;

            // Check if the current character is already present in the unique array
            for (int j = 0; j < uniqueCount; j++) {
                if (uniqueChars[j] == currentChar) {
                    isUnique = false;
                    break;
                }
            }

            // If the character is unique, add it to the uniqueChars array
            if (isUnique) {
                uniqueChars[uniqueCount] = currentChar;
                uniqueCount++;
            }
        }

        // Create a new array of the correct size (uniqueCount) and copy the unique characters into it
        char[] result = new char[uniqueCount];
        System.arraycopy(uniqueChars, 0, result, 0, uniqueCount);

        return result;
    }

    // Method to find the frequency of unique characters in the string and return the result in a 2D array
    public static String[][] findCharacterFrequency(String str) {
        int[] freq = new int[256]; // Array to store frequency of each character (256 for all ASCII characters)

        // Loop through the string and count the frequency of each character
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            freq[currentChar]++; // Increment the frequency at the index corresponding to the character's ASCII value
        }

        // Find the unique characters in the string
        char[] uniqueChars = findUniqueCharacters(str);

        // Create a 2D array to store characters and their frequencies
        String[][] result = new String[uniqueChars.length][2];

        // Store the unique character and its frequency in the result array
        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = String.valueOf(uniqueChars[i]); // Store the character as a string
            result[i][1] = String.valueOf(freq[uniqueChars[i]]); // Store the frequency of the character as a string
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