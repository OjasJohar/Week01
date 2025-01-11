import java.util.Scanner;

public class Divisible_By_Five_01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Taking input from the user:
        System.out.println("Enter the number:");
        int number = input.nextInt();

        // Determining whether the number is divisible by 5 or not:
        if (number % 5 == 0) {
            System.out.println("Is the number " + number + " divisible by 5? Yes");
        } else {
            System.out.println("Is the number " + number + " divisible by 5? NO");
        }

        input.close();
    }
}