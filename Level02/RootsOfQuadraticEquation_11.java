import java.util.Scanner;

public class RootsOfQuadraticEquation_11 {

    // Method to find the roots of the quadratic equation
    public static double[] findRoots(double a, double b, double c) {
        // Calculate the discriminant (delta)
        double delta = Math.pow(b, 2) - 4 * a * c;

        // If delta is positive, calculate two real roots
        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[] { root1, root2 }; // Return both roots
        }
        // If delta is zero, calculate one real root
        else if (delta == 0) {
            double root = -b / (2 * a);
            return new double[] { root }; // Return the one root
        }
        // If delta is negative, no real roots, return an empty array
        else {
            return new double[] {}; // No real roots
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input for coefficients a, b, and c
        System.out.print("Enter coefficient a: ");
        double a = input.nextDouble();

        System.out.print("Enter coefficient b: ");
        double b = input.nextDouble();

        System.out.print("Enter coefficient c: ");
        double c = input.nextDouble();

        // Call the method to find roots
        double[] roots = findRoots(a, b, c);

        // Display the results
        if (roots.length == 0) {
            System.out.println("The equation has no real roots.");
        } else if (roots.length == 1) {
            System.out.println("The equation has one real root: " + roots[0]);
        } else {
            System.out.println("The equation has two real roots: " + roots[0] + " and " + roots[1]);
        }

        //Closing the Scanner class
        input.close();
    }
}