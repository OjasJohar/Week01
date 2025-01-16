import java.util.Scanner;

public class UniqueCharacters_02 {

    // Method to find the length of the text without using String length()
    public static int findLength(String str) {
        int length = 0;
        while (true) {
            try {
                str.charAt(length);
                length++;
            } catch (IndexOutOfBoundsException e) {
                break;
            }
        }
        return length;
    }

    // Method to find unique characters in a string using charAt()
    public static char[] findUniqueCharacters(String str) {
        int length = findLength(str);  // Get the length of the string
        char[] uniqueChars = new char[length];  // Array to store unique characters
        int uniqueCount = 0;  // Counter for unique characters
        
        for (int i = 0; i < length; i++) {
            char currentChar = str.charAt(i);
            boolean isUnique = true;
            
            // Check if the current character has already appeared
            for (int j = 0; j < i; j++) {
                if (str.charAt(j) == currentChar) {
                    isUnique = false;  // If it has appeared before, it's not unique
                    break;
                }
            }
            
            // If the character is unique, add it to the array
            if (isUnique) {
                uniqueChars[uniqueCount] = currentChar;
                uniqueCount++;
            }
        }
        
        // Create a new array to store only the unique characters (without empty spaces)
        char[] result = new char[uniqueCount];
        System.arraycopy(uniqueChars, 0, result, 0, uniqueCount);
        
        return result;
    }

    // Method to display the unique characters
    public static void displayUniqueCharacters(char[] uniqueChars) {
        System.out.print("Unique characters: ");
        for (char c : uniqueChars) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Take input from user
        System.out.print("Enter a string: ");
        String text = input.nextLine();
        
        // Find unique characters
        char[] uniqueChars = findUniqueCharacters(text);
        
        // Display the unique characters
        displayUniqueCharacters(uniqueChars);

        input.close();
    }
}