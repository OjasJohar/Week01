import java.util.Scanner;

public class Largest_Of_Three_03{
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

        // Determining whether the first number is largest or not
        if(number1 >= number2 && number1 >= number3) {
           System.out.println("Is the first number the largest? Yes");
        }else {
           System.out.println("Is the first number the largest? No");
        }

        // Determining whether the second number is largest or not
        if(number2 >= number1 && number2 >= number3) {
           System.out.println("Is the second number the largest? Yes");
        }else {
           System.out.println("Is the second number the largest? No");
        }

        // Determining whether the third number is largest or not
        if (number3 >= number1 && number3 >= number2) {
           System.out.println("Is the third number the largest? Yes");
        }else {
           System.out.println("Is the third number the largest? No");
        }

        input.close();
    }
}