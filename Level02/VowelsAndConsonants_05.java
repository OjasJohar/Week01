import java.util.Scanner;

public class VowelsAndConsonants_05 {

    //Method to check if the character is a vowel, consonant, or not a letter
    public static String checkCharacterType(char c) {
        //Convert to lowercase if the character is uppercase
        c = Character.toLowerCase(c);

        // Check if the character is a vowel
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            return "Vowel";
        } 
        // Check if the character is a consonant (alphabetic letter but not a vowel)
        else if ((c >= 'a' && c <= 'z')) {
            return "Consonant";
        }
        // Not a letter (non-alphabetical character)
        else {
            return "Not a Letter";
        }
    }

    // Method to find the count of vowels and consonants in a string
    public static int[] findVowelsAndConsonants(String str) {
        int vowelsCount = 0;
        int consonantsCount = 0;

        // Loop through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            // Check if the character is a vowel or consonant
            String type = checkCharacterType(c);

            // Increment the count based on the character type
            if (type.equals("Vowel")) {
                vowelsCount++;
            } else if (type.equals("Consonant")) {
                consonantsCount++;
            }
        }

        // Return the counts in an array where [0] = vowels count and [1] = consonants count
        return new int[]{vowelsCount, consonantsCount};
    }

    // Main function to take input and display the result
    public static void main(String[] args) {
		//Creating Scanner object
        Scanner input = new Scanner(System.in);

        //Take user input
        System.out.println("Enter a string:");
        String inputText = input.nextLine();

        //Get the counts of vowels and consonants
        int[] counts = findVowelsAndConsonants(inputText);

        //Display the result
        System.out.println("Number of Vowels: " + counts[0]);
        System.out.println("Number of Consonants: " + counts[1]);

        //Closing Scanner class
		input.close();
    }
}