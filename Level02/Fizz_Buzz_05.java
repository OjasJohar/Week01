import java.util.Scanner;

public class Fizz_Buzz_05 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Taking input from user:
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        // Check if the entered number is positive
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            // Loop from 1 to the entered number
            for (int i = 1; i <= number; i++) {
                // Check if the number is divisible by both 3 and 5
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                }
                // Check if the number is divisible by 3
                else if (i % 3 == 0) {
                    System.out.println("Fizz");
                }
                // Check if the number is divisible by 5
                else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
            }
        }

        input.close();
    }
}