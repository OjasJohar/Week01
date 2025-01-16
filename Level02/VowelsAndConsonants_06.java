import java.util.Scanner;

public class VowelsAndConsonants_06 {

    // Method to check if the character is a vowel, consonant, or not a letter
    public static String checkCharacterType(char c) {
        // Convert to lowercase if the character is uppercase
        c = Character.toLowerCase(c);

        // Check if the character is a vowel
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            return "Vowel";
        }
        // Check if the character is a consonant (alphabetic letter but not a vowel)
        else if (c >= 'a' && c <= 'z') {
            return "Consonant";
        }
        // Not a letter (non-alphabetical character)
        else {
            return "Not a Letter";
        }
    }

    // Method to process the string and store each character's type in a 2D array
    public static String[][] findCharacterTypes(String str) {
        String[][] result = new String[str.length()][2];

        // Loop through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            String type = checkCharacterType(c);

            // Store the character and its type in the 2D array
            result[i][0] = String.valueOf(c); // Character
            result[i][1] = type; // Type (Vowel, Consonant, or Not a Letter)
        }

        return result;
    }

    // Method to display the 2D array in a tabular format using println
    public static void displayCharacterTypes(String[][] characterTypes) {
        // Handle empty input string case
        if (characterTypes == null || characterTypes.length == 0) {
            System.out.println("No characters to display.");
            return;
        }

        // Display the table header
        System.out.println("Character       Type");
        System.out.println("------------------------------");

        // Display the characters and their types
        for (int i = 0; i < characterTypes.length; i++) {
            String character = characterTypes[i][0];
            String type = characterTypes[i][1];

            // Manually format output for consistent column width
            System.out.print(character);
            for (int j = 0; j < (15 - character.length()); j++) {
                System.out.print(" "); // Add spaces to align the character column
            }

            System.out.println(type);
        }
    }

    // Main function to take input and display the result
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.println("Enter a string:");
        String inputText = input.nextLine();

        // Find the character types in the string
        String[][] characterTypes = findCharacterTypes(inputText);

        // Display the result in a tabular format
        displayCharacterTypes(characterTypes);
        //Closing Scanner class
        input.close();
    }
}