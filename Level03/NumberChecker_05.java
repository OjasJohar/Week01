import java.util.Scanner;

public class NumberChecker_05 {

    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    // Method to check if a number is a neon number
    public static boolean isNeon(int number) {
        int square = number * number;
        int sumOfDigits = 0;
        while (square > 0) {
            sumOfDigits += square % 10;
            square /= 10;
        }
        return sumOfDigits == number;
    }

    // Method to check if a number is a spy number
    public static boolean isSpy(int number) {
        int sum = 0;
        int product = 1;
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            product *= digit;
            number /= 10;
        }
        return sum == product;
    }

    // Method to check if a number is an automorphic number
    public static boolean isAutomorphic(int number) {
        int square = number * number;
        return String.valueOf(square).endsWith(String.valueOf(number));
    }

    // Method to check if a number is a buzz number
    public static boolean isBuzz(int number) {
        return number % 7 == 0 || String.valueOf(number).endsWith("7");
    }

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = input.nextInt(); 

        // Check if the number is prime
        if (isPrime(number)) {
            System.out.println(number + " is a Prime number");
        } else {
            System.out.println(number + " is not a Prime number");
        }

        // Check if the number is a neon number
        if (isNeon(number)) {
            System.out.println(number + " is a Neon number");
        } else {
            System.out.println(number + " is not a Neon number");
        }

        // Check if the number is a spy number
        if (isSpy(number)) {
            System.out.println(number + " is a Spy number");
        } else {
            System.out.println(number + " is not a Spy number");
        }

        // Check if the number is an automorphic number
        if (isAutomorphic(number)) {
            System.out.println(number + " is an Automorphic number");
        } else {
            System.out.println(number + " is not an Automorphic number");
        }

        // Check if the number is a buzz number
        if (isBuzz(number)) {
            System.out.println(number + " is a Buzz number");
        } else {
            System.out.println(number + " is not a Buzz number");
        }

        input.close();
    }
}