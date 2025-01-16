import java.util.Scanner;

public class PalindromeChecker_07 {

    // Logic 1: Iterative method to check if a string is palindrome
    public static boolean isPalindromeIterative(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;  // If characters don't match, it's not a palindrome
            }
            start++;
            end--;
        }
        return true;  // All characters matched, it's a palindrome
    }

    // Logic 2: Recursive method to check if a string is palindrome
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) {
            return true;  // Base case: when start index is greater than or equal to end
        }

        if (text.charAt(start) != text.charAt(end)) {
            return false;  // If characters don't match, it's not a palindrome
        }

        // Recursively check the next characters
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    // Logic 3: Using character arrays to check palindrome
    public static boolean isPalindromeUsingArrays(String text) {
        char[] originalArray = text.toCharArray();  // Convert string to char array
        char[] reversedArray = reverseString(text); // Reverse the string

        // Compare the original and reversed arrays
        for (int i = 0; i < originalArray.length; i++) {
            if (originalArray[i] != reversedArray[i]) {
                return false;  // If characters don't match, it's not a palindrome
            }
        }
        return true;  // All characters matched, it's a palindrome
    }

    // Method to reverse the string and return it as a character array
    public static char[] reverseString(String text) {
        int length = text.length();
        char[] reversed = new char[length];
        
        for (int i = 0; i < length; i++) {
            reversed[i] = text.charAt(length - 1 - i);  // Fill reversed array from end to start
        }
        return reversed;
    }

    // Main method to test the palindrome checks
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter a string: ");
        String text = input.nextLine();

        // Check palindrome using all three methods and display results
        boolean isIterativePalindrome = isPalindromeIterative(text);
        boolean isRecursivePalindrome = isPalindromeRecursive(text, 0, text.length() - 1);
        boolean isArrayPalindrome = isPalindromeUsingArrays(text);

        // Display the results
        System.out.println("Using Iterative Method: " + (isIterativePalindrome ? "Palindrome" : "Not a Palindrome"));
        System.out.println("Using Recursive Method: " + (isRecursivePalindrome ? "Palindrome" : "Not a Palindrome"));
        System.out.println("Using Character Arrays Method: " + (isArrayPalindrome ? "Palindrome" : "Not a Palindrome"));

        input.close();
    }
}