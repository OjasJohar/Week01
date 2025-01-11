import java.util.Scanner;

public class Factorial_14 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Taking input from the user
        System.out.println("Enter the number:");
        int num = input.nextInt();

        if (num > 0) {

            // creating variable name factorial
            long factorial = 1;

            // calculating value of factorial using while loop
            int x = num;
            while (num > 0) {
                factorial = factorial * num;
                num--;
            }

            // displaying the result
            System.out.println("The factorial of " + x + " is " + factorial + ".");
        } else {
            System.out.println("The entered number is not a natural number.");
        }

        input.close();
    }

}