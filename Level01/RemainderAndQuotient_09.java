import java.util.Scanner;

public class RemainderAndQuotient_09 {

    // method to find the quotient and remainder
    public static int[] findRemainderAndQuotient(int number, int divisor) {

        // declaring an array to store the quotient and remainder
        int arr[] = new int[2]; // arr[0]=remainder, arr[1]=quotient
        arr[0] = number % divisor;
        arr[1] = number / divisor;

        return arr;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // taking user input in number variable
        System.out.println("Enter the first Number: ");
        int number = input.nextInt();

        // taking user input in divisor variable
        System.out.println("Enter the divisor Number: ");
        int divisor = input.nextInt();

        // calculating the quotient and Ramainder
        int arr[] = findRemainderAndQuotient(number, divisor);

        // printing ht output
        System.out.println("The remainder of the two number is: " + arr[0]);
        System.out.println("The quotient of the two number is: " + arr[1]);

        input.close();
    }
}