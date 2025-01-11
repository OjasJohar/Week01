import java.util.Scanner;

public class Sum_Of_Numbers_10 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Taking input from the user:
        System.out.println("Enter the number:");
        double num = input.nextDouble();

        // creating variable to store total addition
        double total = 0;

        // checking whether user has entered 0 or not
        // if entered number is 0 then terminate the loop
        // else add num to total and taking input again
        while (num != 0) {
            total = total + num;
            System.out.println("Enter the number again:");
            num = input.nextDouble();
        }

        // printing the result
        System.out.println("The total value is: " + total);

        input.close();
    }
}