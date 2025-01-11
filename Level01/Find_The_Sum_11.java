import java.util.Scanner;

public class Find_The_Sum_11 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Taking input from the user
        System.out.println("Enter the number:");
        double num = input.nextDouble();

        // creating variable to store total addition
        double total = 0;

        // using infinite white loop
        while (true) {
            if (num <= 0) {
                break;
            }
            total = total + num;
            System.out.println("Enter the number again:");
            num = input.nextDouble();
        }

        // printing the result
        System.out.println("The total value is: " + total);

        input.close();
    }
}