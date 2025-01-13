import java.util.Scanner;

public class FactorsOfNumber_01 {

    //Method to find the factors
    public static int[] findingFactors(int number) {
        //To count the number of factors
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        // initializing the array of size count to store the factors
        int index = 0;
        int[] factors = new int[count];
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index] = i;
                index++;
            }
        }
        return factors;
    }

    // method to find the sum of factors
    public static int findingFactorsSum(int[] factors) {
        int factorsSum = 0;
        for (int i = 0; i < factors.length; i++) {
            factorsSum = factorsSum + factors[i];
        }
        return factorsSum;
    }

    // method to find the product of factors
    public static int findingFactorsProduct(int[] factors) {
        int factorsProduct = 1;
        for (int i = 0; i < factors.length; i++) {
            factorsProduct = factorsProduct * factors[i];
        }
        return factorsProduct;
    }

    // method to find the product of factors
    public static int findingFactorsSquareSum(int[] factors) {
        int factorsSquareSum = 0;
        for (int i = 0; i < factors.length; i++) {
            factorsSquareSum = factorsSquareSum + factors[i] * factors[i];
        }
        return factorsSquareSum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Taking input from the user in number variable
        System.out.println("Enter the natural number: ");
        int number = input.nextInt();

        //Calling method to find factors
        int[] factors = findingFactors(number);

        //Calling method to find sum of the factors, product of the factors, sum of Square of factors
        int factorsSum = findingFactorsSum(factors);
        int factorsProduct = findingFactorsProduct(factors);
        int factorsSquareSum = findingFactorsSquareSum(factors);

        //printing the result
        System.out.println("The factors of the given number " + number + " is ");
        for(int i=0;i<factors.length;i++){
            System.out.print(factors[i]+ " ");
        }
        System.out.println("\nThe sum of the factors is: " + factorsSum + ".");
        System.out.println("The product of the factors is: " + factorsProduct + ".");
        System.out.println("The sum of Squares of the factors is: " + factorsSquareSum + ".");

        //Closing the Scanner class
		input.close();
    }
}
