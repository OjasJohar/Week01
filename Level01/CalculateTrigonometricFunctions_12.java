import java.util.Scanner;

public class CalculateTrigonometricFunctions_12 {

    // Method to calculate trigonometric functions
    public double[] calculateTrigonometricFunctions(double angle) {

        // Convert angle from degrees to radians
        double radians = Math.toRadians(angle);

        // Calculate sine, cosine, and tangent
        double sin = Math.sin(radians);
        double cos = Math.cos(radians);
        double tan = Math.tan(radians);

        // Return the results in an array
        double[] arr = { sin, cos, tan };
        return arr;
    }

    public static void main(String[] args) {

        //Creating Scanner object
		Scanner input = new Scanner(System.in);

        CalculateTrigonometricFunctions_12 calculator = new CalculateTrigonometricFunctions_12();

        //Taking input from the user in angle variable
        System.out.println("Enter the angle(in degree):");
        double angle = input.nextDouble();

        //Calculate trigonometric functions
        double[] results = calculator.calculateTrigonometricFunctions(angle);

        //Display the results:
        System.out.println("For angle " + angle + " degrees:");
        System.out.println("Sine: " + results[0]);
        System.out.println("Cosine: " + results[1]);
        System.out.println("Tangent: " + results[2]);

        //Closing Scanner class
		input.close();
    }
}