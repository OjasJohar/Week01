import java.util.Scanner;

public class Odd_And_Even_16 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // taking input from the user
        System.out.println("Enter the number:");
        int number = input.nextInt();

        if (number > 0) {

            // determine whether the number is even or odd in each iteration
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) {
                    System.out.println("The number " + i + " is even number.");
                } else {
                    System.out.println("The number " + i + " is odd number.");
                }
            }

        } else {
            System.out.println("The entered number is not a natural number.");
        }

        input.close();
    }
}