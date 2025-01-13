import java.util.Arrays;
import java.util.Scanner;

public class NumberChecker_03 {

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

    // Method to find the sum of the digits of the number
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    // Method to find the sum of the squares of the digits of the number
    public static double sumOfSquaresOfDigits(int[] digits) {
        double sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2); // Sum of squares
        }
        return sum;
    }

    // Method to check if a number is a Harshad number
    public static boolean isHarshadNumber(int[] digits, int number) {
        int sumOfDigits = sumOfDigits(digits);
        return number % sumOfDigits == 0; // A number is Harshad if divisible by sum of its digits
    }

    // Method to find the frequency of each digit in the number
    public static int[][] digitFrequency(int[] digits) {
        int[][] frequency = new int[10][2]; // For digits 0-9, store the digit and frequency
        
        // Initialize digit frequency array
        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i; // The first column holds the digit
            frequency[i][1] = 0; // Initialize frequency to 0
        }

        // Count frequency of each digit
        for (int digit : digits) {
            frequency[digit][1]++;
        }

        return frequency;
    }

    // Method to display the frequency of each digit
    public static void displayDigitFrequency(int[][] frequency) {
        System.out.println("Digit | Frequency");
        for (int i = 0; i < 10; i++) {
            if (frequency[i][1] > 0) {
                System.out.println(frequency[i][0] + "     | " + frequency[i][1]);
            }
        }
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

        // Sum of digits
        System.out.println("Sum of digits: " + sumOfDigits(digits));

        // Sum of squares of digits
        System.out.println("Sum of squares of digits: " + sumOfSquaresOfDigits(digits));

        // Check if the number is a Harshad number
        if (isHarshadNumber(digits, number)) {
            System.out.println(number + " is a Harshad number");
        } else {
            System.out.println(number + " is not a Harshad number");
        }

        // Get and display the frequency of each digit
        int[][] frequency = digitFrequency(digits);
        displayDigitFrequency(frequency);

        input.close();
    }
}