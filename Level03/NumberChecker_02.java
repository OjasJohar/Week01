import java.util.Arrays;
import java.util.Scanner;

public class NumberChecker_02 {

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

    // Method to check if the number is a Duck Number
    public static boolean isDuckNumber(int[] digits) {
        // A Duck Number has a non-zero digit in it (except the first digit)
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0) {
                return true; // Duck Number
            }
        }
        return false; // Not a Duck Number
    }

    // Method to check if the number is an Armstrong Number
    public static boolean isArmstrongNumber(int[] digits, int originalNumber) {
        int sum = 0;
        int numberOfDigits = digits.length;
        
        for (int digit : digits) {
            sum += Math.pow(digit, numberOfDigits);
        }
        
        return sum == originalNumber;
    }

    // Method to find the largest and second largest elements in the digits array
    public static int[] findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int digit : digits) {
            if (digit >= largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit >= secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }
        
        return new int[] { largest, secondLargest };
    }

    // Method to find the smallest and second smallest elements in the digits array
    public static int[] findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int digit : digits) {
            if (digit <= smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit <= secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }
        }
        
        return new int[] { smallest, secondSmallest };
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = input.nextInt(); 

        // Store digits in an array
        int[] digits = storeDigits(number);

        // Display count of digits
        System.out.println("Count of digits: " + countDigits(number));

        // Display the digits array
        System.out.println("Digits of the number: " + Arrays.toString(digits));

        // Check if the number is a Duck number
        if (isDuckNumber(digits)) {
            System.out.println(number + " is a Duck Number");
        } else {
            System.out.println(number + " is not a Duck Number");
        }

        // Check if the number is an Armstrong number
        if (isArmstrongNumber(digits, number)) {
            System.out.println(number + " is an Armstrong Number");
        } else {
            System.out.println(number + " is not an Armstrong Number");
        }

        // Find largest and second largest elements
        int[] largestAndSecondLargest = findLargestAndSecondLargest(digits);
        System.out.println("Largest digit: " + largestAndSecondLargest[0]);
        System.out.println("Second largest digit: " + largestAndSecondLargest[1]);

        // Find smallest and second smallest elements
        int[] smallestAndSecondSmallest = findSmallestAndSecondSmallest(digits);
        System.out.println("Smallest digit: " + smallestAndSecondSmallest[0]);
        System.out.println("Second smallest digit: " + smallestAndSecondSmallest[1]);

        input.close();
    }
}