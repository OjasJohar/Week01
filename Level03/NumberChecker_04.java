import java.util.Arrays;
import java.util.Scanner;

public class NumberChecker_04 {

    // Method to find the count of digits in the number
    public static int countDigits(int number) {
        int count=0;
        int temp=number;
        while(temp>0){
          temp=temp/10;
          count++;
       }
       return count;
    }

    // Method to store the digits of the number in a digits array
    public static int[] storeDigits(int number) {
        int digitCount = countDigits(number);
        int[] digits = new int[digitCount];
        
        for (int i = digitCount - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        
        return digits;
    }

    // Method to reverse the digits array
    public static int[] reverseDigits(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }

    // Method to compare two arrays and check if they are equal
    public static boolean areArraysEqual(int[] array1, int[] array2) {
        return Arrays.equals(array1, array2);
    }

    // Method to check if a number is a palindrome
    public static boolean isPalindrome(int[] digits) {
        int[] reversedDigits = reverseDigits(digits);
        return areArraysEqual(digits, reversedDigits); // Check if original digits are equal to reversed digits
    }

    // Method to check if a number is a Duck number
    public static boolean isDuckNumber(int[] digits) {
        // A Duck number has at least one non-zero digit and must not start with 0
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] != 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = input.nextInt(); 

        // Store digits of the number
        int[] digits = storeDigits(number);

        // Display the count of digits
        System.out.println("Count of digits: " + countDigits(number));

        // Display the digits array
        System.out.println("Digits of the number: " + Arrays.toString(digits));

        // Reverse the digits and display the reversed array
        int[] reversedDigits = reverseDigits(digits);
        System.out.println("Reversed digits: " + Arrays.toString(reversedDigits));

        // Check if the number is a palindrome
        if (isPalindrome(digits)) {
            System.out.println(number + " is a Palindrome number");
        } else {
            System.out.println(number + " is not a Palindrome number");
        }

        // Check if the number is a Duck number
        if (isDuckNumber(digits)) {
            System.out.println(number + " is a Duck number");
        } else {
            System.out.println(number + " is not a Duck number");
        }

        // Example of comparing arrays (for illustration)
        int[] anotherDigits = storeDigits(12021); // Same number to compare
        if (areArraysEqual(digits, anotherDigits)) {
            System.out.println("The digit arrays are equal");
        } else {
            System.out.println("The digit arrays are not equal");
        }

        input.close();
    }
}