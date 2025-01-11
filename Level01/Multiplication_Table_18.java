import java.util.Scanner;

public class Multiplication_Table_18 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Taking input from the user
        System.out.println("Enter the number:");
        int number = input.nextInt();

        if (number >= 6 && number <= 9) {

            // printing the multiplication table
            for (int i = 1; i <= 10; i++) {
                int ans = i * number;
                System.out.println(number + " * " + i + " = " + ans);
            }
        } else {
            System.out.println("The given number is not in the range from 6 to 9.");
        }

        input.close();
    }

}