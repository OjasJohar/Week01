import java.util.Scanner;

public class First_The_Smallest_02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Taking input from the user:
        System.out.println("Enter the first number:");
        int number1 = input.nextInt();

        // Taking input from the user:
        System.out.println("Enter the second number:");
        int number2 = input.nextInt();

        // Taking input from the user:
        System.out.println("Enter the third number:");
        int number3 = input.nextInt();

        // Determining whether the first number is smallest or not:
        if(number1 <= number2 && number1 <= number3) {
            System.out.println("Is the first number the smallest? Yes");
        }else {
            System.out.println("Is the first number the smallest? No");
        }

        input.close();
    }
}