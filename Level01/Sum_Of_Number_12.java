import java.util.Scanner;

public class Sum_Of_Number_12 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Taking input from the user
        System.out.println("Enter the number:");
        int num = input.nextInt();

        if (num > 0) {

            // creating variable to store total addition
            int totalUsingLoop = 0;

            // calculating value using formula
            int totalUsingFormula = (num * (num + 1)) / 2;

            // using while calculating sum of n natural numbers
            while (num > 0) {
                totalUsingLoop += num;
                num--;
            }

            // compairing
            String name;
            if (totalUsingLoop == totalUsingFormula)
                name = "same";
            else
                name = "not same";

            // printing the output
            System.out.println("Total using while loop is " + totalUsingLoop + " and the total computed using the formula is "
            + totalUsingFormula + ", both the sum are " + name);

        } else {
            System.out.println("The entered number is not a natural number.");
        }

        input.close();
    }
}