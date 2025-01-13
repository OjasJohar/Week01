import java.util.Scanner;

public class ChocolateDistribution_10 {

    //Method to find the quotient and remainder
    public static double[] findRemainderAndQuotient(int number, int divisor) {

        //Declaring an array to store the quotient and remainder
        double arr[] = new double[2]; // arr[0]=remainder, arr[1]=quotient
        arr[1] = divisor / number;
        arr[0] = divisor % number;

        return arr;
    }

    public static void main(String[] args) {
		
		//Creating Scanner object
        Scanner input = new Scanner(System.in);

        //Taking user input in numberOfChildren variable
        System.out.println("Enter the Number of Children: ");
        int numberOfChildren = input.nextInt();

        //Taking user input in numberOfChocolates variable
        System.out.println("Enter the Number of Chocolates: ");
        int numberOfChocolates = input.nextInt();

        //Calculating the quotient and Remainder
        double arr[] = findRemainderAndQuotient(numberOfChildren, numberOfChocolates);

        // printing ht output
        System.out.println("Each children will get " + arr[1] + " chocolates");
        System.out.println("Remaining chocolates: " + arr[0]);

        //Closing Scanner class
		input.close();
    }
}