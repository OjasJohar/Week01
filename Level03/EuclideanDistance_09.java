import java.util.Scanner;

public class EuclideanDistance_09 {

    // Method to calculate the Euclidean distance between two points (x1, y1) and
    // (x2, y2)
    public static double calculateEuclideanDistance(double x1, double y1, double x2, double y2) {
        // Calculate the distance using the Euclidean formula
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    // Method to calculate the equation of the line given two points
    public static double[] findLineEquation(double x1, double y1, double x2, double y2) {
        // Calculate the slope (m)
        double m = (y2 - y1) / (x2 - x1);

        // Calculate the y-intercept (b)
        double b = y1 - (m * x1);

        // Return an array containing the slope (m) and the y-intercept (b)
        return new double[] { m, b };
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user inputs for the points (x1, y1) and (x2, y2)
        System.out.print("Enter the coordinates of the first point (x1, y1): ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        System.out.print("Enter the coordinates of the second point (x2, y2): ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        // Calculate the Euclidean distance between the two points
        double distance = calculateEuclideanDistance(x1, y1, x2, y2);
        System.out.println("The Euclidean distance between the two points is: " + distance);

        // Find the equation of the line
        double[] lineEquation = findLineEquation(x1, y1, x2, y2);
        double slope = lineEquation[0];
        double yIntercept = lineEquation[1];

        // Display the equation of the line
        System.out.printf("The equation of the line is: y = %.2fx + %.2f\n", slope, yIntercept);
        scanner.close();
    }
}