import java.util.Scanner;

public class AnagramChecker_08 {

    // Method to check if two texts are anagrams
    public static boolean areAnagrams(String text1, String text2) {
        // Check if lengths are different, if so return false
        if (text1.length() != text2.length()) {
            return false;
        }

        // Convert strings to lowercase to make the comparison case-insensitive
        text1 = text1.toLowerCase();
        text2 = text2.toLowerCase();

        // Create arrays to store frequency of characters for both texts
        int[] frequencyText1 = new int[256];  // ASCII characters range
        int[] frequencyText2 = new int[256];

        // Loop to fill the frequency arrays
        for (int i = 0; i < text1.length(); i++) {
            frequencyText1[text1.charAt(i)]++;
            frequencyText2[text2.charAt(i)]++;
        }

        // Compare the frequency arrays
        for (int i = 0; i < 256; i++) {
            if (frequencyText1[i] != frequencyText2[i]) {
                return false;  // If frequencies don't match, return false
            }
        }

        // If all frequencies match, the texts are anagrams
        return true;
    }

    // Main method to take user input and display the result
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input for both strings
        System.out.print("Enter first text: ");
        String text1 = input.nextLine();

        System.out.print("Enter second text: ");
        String text2 = input.nextLine();

        // Check if the texts are anagrams
        boolean result = areAnagrams(text1, text2);

        // Display the result
        if (result) {
            System.out.println("The texts are anagrams.");
        } else {
            System.out.println("The texts are not anagrams.");
        }

        input.close();
    }
}