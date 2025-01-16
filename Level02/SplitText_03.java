import java.util.Scanner;

public class SplitText_03 {

    //method to find string length
    public static int findingLength(String s) {
        //Declaring a count variable
        int count = 0;
        try {
            while (true) {
                s.charAt(count);
                count++;
            }
        } catch (Exception e) {
            //
        }
        return count;
    }

    // Method to split text into words using charAt() and manually identifying
    // spaces
    public static String[] textSplit(String text) {
        int length = findingLength(text);
        int wordCount = 1; // There's at least one word
        int[] spaceIndexes = new int[length];
        int spaceIndex = 0;

        // Identify space locations
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[spaceIndex++] = i;
                wordCount++;
            }
        }

        // Create an array to store words
        String[] words = new String[wordCount];
        int startIndex = 0;
        int wordIndex = 0;

        // Extract words using space indexes
        for (int i = 0; i <= spaceIndex; i++) {
            int endIndex = (i == spaceIndex) ? length : spaceIndexes[i];
            words[wordIndex++] = text.substring(startIndex, endIndex).trim();
            startIndex = endIndex + 1;
        }

        return words;
    }

    // Method to create a 2D array with words and their lengths
    public static String[][] getWordsWithLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i]; // Word
            result[i][1] = String.valueOf(findingLength(words[i])); // Length as String
        }
        return result;
    }

    // Main function to take input and display the result
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get user input
        System.out.println("Enter a sentence:");
        String inputText = input.nextLine();

        // Split the text into words using the custom method
        String[] words = textSplit(inputText);

        // Get words with their lengths in a 2D array
        String[][] wordsWithLengths = getWordsWithLengths(words);

        // Display the result in a tabular format
        System.out.println("\nWord\t\tLength");
        System.out.println("-----------------------");
        for (int i = 0; i < wordsWithLengths.length; i++) {
            System.out.println(wordsWithLengths[i][0] + "\t\t" + Integer.parseInt(wordsWithLengths[i][1]));
        }

        //Closing the Scanner Class
		input.close();
    }
}