import java.util.Scanner;

public class NumberChecker_06 {

    // Method to find factors of a number and return them as an array
    public static int[] findFactors(int number) {
        int[] factors = new int[number / 2];  // Maximum factors for any number are half of that number
        int count = 0;

        // Find all factors of the number
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                factors[count++] = i;
            }
        }

        // Trim the array to fit the number of factors found
        int[] result = new int[count];
        System.arraycopy(factors, 0, result, 0, count);
        return result;
    }

    // Method to find the greatest factor of a number using the factors array
    public static int greatestFactor(int[] factors) {
        int max = 0;
        for (int factor : factors) {
            if (factor > max) {
                max = factor;
            }
        }
        return max;
    }

    // Method to find the sum of the factors using factors array and return the sum
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to find the product of the factors using factors array and return the product
    public static int productOfFactors(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to find the product of the cube of the factors using factors array
    public static double productOfCubesOfFactors(int[] factors) {
        double product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }

    // Method to check if a number is a perfect number
    public static boolean isPerfectNumber(int number) {
        int[] factors = findFactors(number);
        int sum = sumOfFactors(factors);
        return sum == number;
    }

    // Method to check if a number is an abundant number
    public static boolean isAbundantNumber(int number) {
        int[] factors = findFactors(number);
        int sum = sumOfFactors(factors);
        return sum > number;
    }

    // Method to check if a number is a deficient number
    public static boolean isDeficientNumber(int number) {
        int[] factors = findFactors(number);
        int sum = sumOfFactors(factors);
        return sum < number;
    }

    // Method to check if a number is a strong number
    public static boolean isStrongNumber(int number) {
        int temp = number;
        int sum = 0;

        // Calculate the sum of the factorial of the digits
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }

        return sum == number;
    }

    // Helper method to calculate factorial of a number
    private static int factorial(int number) {
        int fact = 1;
        for (int i = 1; i <= number; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = input.nextInt(); 

        // Find the factors of the number
        int[] factors = findFactors(number);
        System.out.println("Factors of " + number + ": ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();

        // Find the greatest factor
        int greatest = greatestFactor(factors);
        System.out.println("Greatest factor of " + number + ": " + greatest);

        // Find the sum of the factors
        int sum = sumOfFactors(factors);
        System.out.println("Sum of the factors: " + sum);

        // Find the product of the factors
        int product = productOfFactors(factors);
        System.out.println("Product of the factors: " + product);

        // Find the product of the cubes of the factors
        double productOfCubes = productOfCubesOfFactors(factors);
        System.out.println("Product of the cubes of the factors: " + productOfCubes);

        // Check if the number is a perfect number
        if (isPerfectNumber(number)) {
            System.out.println(number + " is a Perfect number");
        } else {
            System.out.println(number + " is not a Perfect number");
        }

        // Check if the number is an abundant number
        if (isAbundantNumber(number)) {
            System.out.println(number + " is an Abundant number");
        } else {
            System.out.println(number + " is not an Abundant number");
        }

        // Check if the number is a deficient number
        if (isDeficientNumber(number)) {
            System.out.println(number + " is a Deficient number");
        } else {
            System.out.println(number + " is not a Deficient number");
        }

        // Check if the number is a strong number
        if (isStrongNumber(number)) {
            System.out.println(number + " is a Strong number");
        } else {
            System.out.println(number + " is not a Strong number");
        }

        input.close();
    }
}