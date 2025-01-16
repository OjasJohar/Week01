import java.util.Scanner;

public class CharacterFrequency_06 {

    // Method to find the frequency of characters in a string
    public static String[] findCharacterFrequency(String str) {
        char[] characters = str.toCharArray(); // Convert string to character array
        int length = characters.length;

        // Array to store the frequency of each character
        int[] frequency = new int[length];

        // Nested loop to count the frequency of each character
        for (int i = 0; i < length; i++) {
            // If the character is not counted yet, initialize its frequency to 1
            if (characters[i] != '0') {
                frequency[i] = 1;
                // Compare the current character with subsequent characters to count duplicates
                for (int j = i + 1; j < length; j++) {
                    if (characters[i] == characters[j]) {
                        frequency[i]++;
                        characters[j] = '0'; // Set duplicate characters to '0' to avoid counting them again
                    }
                }
            }
        }

        // Prepare a result array to store the characters and their frequencies
        String[] result = new String[length];
        int index = 0;

        // Store the characters and their frequencies in the result array
        for (int i = 0; i < length; i++) {
            if (characters[i] != '0') {
                result[index] = "Character: " + characters[i] + " | Frequency: " + frequency[i];
                index++;
            }
        }

        // Resize the result array to contain only valid entries
        String[] finalResult = new String[index];
        System.arraycopy(result, 0, finalResult, 0, index);

        return finalResult;
    }

    // Method to display the frequency of characters
    public static void displayCharacterFrequency(String[] frequencyData) {
        System.out.println("Character Frequency:");
        System.out.println("-------------------------");
        for (String entry : frequencyData) {
            System.out.println(entry);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter a string: ");
        String text = input.nextLine();

        // Find the frequency of characters
        String[] frequencyData = findCharacterFrequency(text);

        // Display the frequency of characters
        displayCharacterFrequency(frequencyData);

        input.close();
    }
}