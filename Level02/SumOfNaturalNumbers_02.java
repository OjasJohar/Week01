import java.util.Scanner;

public class SumOfNaturalNumbers_02 {

    // method to find the sum of n natural number using recursion
    public static int findingSumRecursion(int number) {
        // calculating sum using recursion
        if (number == 1) {
            return 1;
        } else {
            return number + findingSumRecursion(number - 1);
        }
    }

    // method to find the sum of n natural number using formula
    public static int findingSumFormula(int number) {
        // calculating sum using formula
        int sum = (number * (number + 1)) / 2;
        return sum;
    }

    public static void main(String[] args) {

        //Creating Scanner object
		Scanner input = new Scanner(System.in);

        //Taking input from the user in number variable
        System.out.println("Enter the natural number: ");
        int number = input.nextInt();
        if(number <= 0) {
            System.exit(0);
        }

        //Calling methods to calculate sum using recursion and formula
        int sumRecursion = findingSumRecursion(number);
        int sumFormula = findingSumFormula(number);

        // comparing the result
        String flag;
        if (sumRecursion == sumFormula) {
            flag = "same.";
        } else {
            flag = "not same.";
        }

        // printing the output
        System.out.println("The sum of "+ number +" natural number is " 
		+ sumFormula + " and both are " + flag);

        //Closing Scanner class
		input.close();
    }

}