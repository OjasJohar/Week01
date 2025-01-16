import java.util.Scanner;

public class TrimStringComparison_07 {

    // Method to trim leading and trailing spaces using charAt()
    public static int[] trimString(String str) {
        int start = 0;
        int end = str.length() - 1;

        // Find the first non-space character
        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }

        // Find the last non-space character
        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }

        // Return the start and end indices in an array
        return new int[] { start, end };
    }

    // Method to create a substring using charAt()
    public static String createSubstring(String str, int start, int end) {
        // Create an empty string to store the substring
        String substring = "";

        // Loop from start to end index and concatenate each character to the substring
        for (int i = start; i <= end; i++) {
            substring += str.charAt(i); // Concatenate each character
        }

        // Return the constructed substring
        return substring;
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        // Compare each character of the strings
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    // Main function
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.println("Enter a string with leading and trailing spaces:");
        String inputString = input.nextLine();

        // Trim the string using charAt() method
        int[] trimIndices = trimString(inputString);
        String trimmedUsingCharAt = createSubstring(inputString, trimIndices[0], trimIndices[1]);

        // Trim the string using the built-in trim() method
        String trimmedUsingTrim = inputString.trim();

        // Compare the two trimmed strings
        boolean areStringsEqual = compareStrings(trimmedUsingCharAt, trimmedUsingTrim);

        // Display the result
        System.out.println("Trimmed using charAt(): " + "'" + trimmedUsingCharAt + "'");
        System.out.println("Trimmed using trim(): " + "'" + trimmedUsingTrim + "'");
        System.out.println("Are the two strings equal? " + areStringsEqual);

        input.close();
    }
}