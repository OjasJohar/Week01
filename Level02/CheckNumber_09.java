import java.util.Scanner;

public class CheckNumber_09 {

    // Method to check if the number is positive or negative
    public static boolean isPositive(int number) {
        if (number > 0) {
            return true;
        } else {
            return false;
        }

    }

    // Method to check if the number is even or odd
    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    // Method to compare two numbers and return 1 if number1 > number2,
    // 0 if both are equal, and -1 if number1 < number2
    public static int compare(int number1, int number2) {
        if (number1 > number2) {
            return 1; // number1 is greater than number2
        } else if (number1 < number2) {
            return -1; // number1 is less than number2
        } else {
            return 0; // Both are equal
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Array to store 5 numbers
        int[] numbers = new int[5];

        // Taking user input for 5 numbers
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        // Loop through the array and check each number
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            // Check if the number is positive or negative
            if (isPositive(num)) {
                // If positive, check if it is even or odd
                if (isEven(num)) {
                    System.out.println(num + " is positive and even.");
                } else {
                    System.out.println(num + " is positive and odd.");
                }
            } else {
                System.out.println(num + " is negative.");
            }
        }

        // Compare the first and last elements of the array
        int comparisonResult = compare(numbers[0], numbers[4]);

        // Display the comparison result
        if (comparisonResult == 1) {
            System.out.println("First element is greater than the last element.");
        } else if (comparisonResult == 0) {
            System.out.println("First element is equal to the last element.");
        } else {
            System.out.println("First element is less than the last element.");
        }

  
        input.close();
    }
}