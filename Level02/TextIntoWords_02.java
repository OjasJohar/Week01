import java.util.Scanner;

public class TextIntoWords_02 {

    //Method to find string length
    public static int findingLength(String s) {
        //Declaring a count variable
        int count = 0;
        try{
            while(true) {
                s.charAt(count);
                count++;
            }
        }catch (Exception e) {
            //
        }
        return count;
    }

    //Method to split text into words using charAt() and manually identifying
    //spaces
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

        //Create an array to store words
        String[] words = new String[wordCount];
        int startIndex = 0;
        int wordIndex = 0;

        //Extract words using space indexes
        for (int i = 0; i <= spaceIndex; i++) {
            int endIndex = (i == spaceIndex) ? length : spaceIndexes[i];
            words[wordIndex++] = text.substring(startIndex, endIndex).trim();
            startIndex = endIndex + 1;
        }
        return words;
    }

    //Method to compare two arrays of Strings
    public static boolean compareArrays(String[] array1, String[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (!array1[i].equals(array2[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
		//Creating Scanner object
        Scanner input = new Scanner(System.in);

        //Get user input
        System.out.println("Enter a sentence:");
        String inputText = input.nextLine();

        //Using the custom split method
        String[] customSplitWords = textSplit(inputText);

        //Using the built-in split method
        String[] splitWords = inputText.split(" ");

        //Compare the results
        boolean areEqual = compareArrays(customSplitWords, splitWords);

        //Display the results
        System.out.println("Custom Split Method:");
        for (String word : customSplitWords) {
            System.out.println(word);
        }

        System.out.println("\nBuilt-in Split Method:");
        for (String word : splitWords) {
            System.out.println(word);
        }

        //Display if both methods gave the same result
        System.out.println("\nAre both methods result the same? " + areEqual);

        //Closing Scanner class
		input.close();
    }
}