import java.util.Scanner;

public class WordReplacer_12 {

    // Method to replace a word in a sentence without using StringBuilder or built-in methods
    public static String replaceWord(String sentence, String target, String replacement) {
        // Split the sentence into words using space 
        String[] words = sentence.split(" ");
        
        // Initialize the result string
        String result = "";

        // Loop through each word in the sentence
        for (String word : words) {
            // If the word matches the target, append the replacement to the result
            if (word.equals(target)) {
                result += replacement;
            } else {
                result += word;
            }
            
            // Add a space after each word except for the last one
            result += " ";
        }

        // Remove the trailing space from the result
        if (result.length() > 0) {
            result = result.substring(0, result.length() - 1);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accepting the sentence, target word, and replacement word from the user
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        System.out.print("Enter the word to replace: ");
        String target = scanner.nextLine();

        System.out.print("Enter the replacement word: ");
        String replacement = scanner.nextLine();

        // Replacing the target word with the replacement word
        String updatedSentence = replaceWord(sentence, target, replacement);

        // Output the modified sentence
        System.out.println("Updated sentence: " + updatedSentence);

        scanner.close();
    }
}