import java.util.Scanner;

public class Prime_Number_04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Prime number check
        boolean isPrime = true;

        // Prime numbers are greater than 1
        if (number <= 1) {
            isPrime = false;
        } else {
            // Check divisibility from 2 to the square root of the number
            for (int i = 2; i < number ; i++) {
                if (number % i == 0) {
                    isPrime = false; // It is divisible by i, so not prime
                    break;
                }
            }
        }

        // printing the result
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        input.close();
    }
}