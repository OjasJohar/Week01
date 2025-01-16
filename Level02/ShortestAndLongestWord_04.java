import java.util.Scanner;

public class ShortestAndLongestWord_04 {

    // method to find string length
    public static int findingLength(String s) {
        // declaring a count variable
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

    // Method to find the shortest and longest word in the 2D array
    public static int[] findShortestAndLongestWord(String[][] wordsWithLengths) {
        int shortestIndex = 0;
        int longestIndex = 0;

        // Initialize lengths for comparison
        int shortestLength = Integer.MAX_VALUE;
        int longestLength = Integer.MIN_VALUE;

        // Find the shortest and longest word
        for (int i = 0; i < wordsWithLengths.length; i++) {
            int length = Integer.parseInt(wordsWithLengths[i][1]);
            if (length < shortestLength) {
                shortestLength = length;
                shortestIndex = i;
            }
            if (length > longestLength) {
                longestLength = length;
                longestIndex = i;
            }
        }

        // Return the indices of the shortest and longest word
        return new int[] { shortestIndex, longestIndex };
    }

    // Main function to take input and display the result
    public static void main(String[] args) {
		//Creating Scanner object
        Scanner input = new Scanner(System.in);

        //Get user input
        System.out.println("Enter a sentence:");
        String inputText = input.nextLine();

        //Split the text into words using the custom method
        String[] words = textSplit(inputText);

        // Get words with their lengths in a 2D array
        String[][] wordsWithLengths = getWordsWithLengths(words);

        // Find the shortest and longest word in the 2D array
        int[] shortestAndLongest = findShortestAndLongestWord(wordsWithLengths);

        // Display the words and their lengths
        System.out.println("\nWord\t\tLength");
        System.out.println("-----------------------");
        for (int i = 0; i < wordsWithLengths.length; i++) {
            System.out.println(wordsWithLengths[i][0] + "\t\t" + Integer.parseInt(wordsWithLengths[i][1]));
        }

        // Display the shortest and longest word
        System.out.println("\nShortest word: " + wordsWithLengths[shortestAndLongest[0]][0] + " (Length: "
                + wordsWithLengths[shortestAndLongest[0]][1] + ")");
        System.out.println("Longest word: " + wordsWithLengths[shortestAndLongest[1]][0] + " (Length: "
                + wordsWithLengths[shortestAndLongest[1]][1] + ")");

        input.close();
    }
}