import java.util.Scanner;

public class CountDown_For_09 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Taking input from the user
        System.out.println("Enter the count down number to start:");
        int counter = input.nextInt();

        if (counter > 0) {
            // using while loop count down the number
            for (int i = counter; i > 0; i--) {
                System.out.println(i + "...");
            }
        } else {
            System.out.println("Number is not a natural number.");
        }

        input.close();
    }
}