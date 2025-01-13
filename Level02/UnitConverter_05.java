import java.util.Scanner;

public class UnitConverter_05 {

    // Method to convert yards to feet
    public static double convertYardsToFeet(double yards) {

        // convert yards to feet
        double yards2feet = 3; // 1 yard = 3 feet
        double feet = yards * yards2feet;
        return feet;
    }

    // Method to convert feet to yards
    public static double convertFeetToYards(double feet) {

        // convert feet to yards
        double feet2yards = 0.333333; // 1 foot = 1/3 yard
        double yards = feet * feet2yards;
        return yards;
    }

    // Method to convert meters to inches
    public static double convertMetersToInches(double meters) {

        // convert meters to inches
        double meters2inches = 39.3701; // 1 meter = 39.3701 inches
        double inches = meters * meters2inches;
        return inches;
    }

    // Method to convert inches to meters
    public static double convertInchesToMeters(double inches) {

        // convert inches to meters
        double inches2meters = 0.0254; // 1 inch = 0.0254 meters
        double meters = inches * inches2meters;
        return meters;
    }

    // Method to convert inches to centimeters
    public static double convertInchesToCentimeters(double inches) {

        // convert inches to centimeters
        double inches2cm = 2.54; // 1 inch = 2.54 cm
        double centimeters = inches * inches2cm;
        return centimeters;
    }

    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Take input in meter
        System.out.print("Enter the distance in meters: ");
        double meters = input.nextDouble();

        // Display value in inches
        double metersToInches = UnitConverter_05.convertMetersToInches(meters);
        System.out.println("Distance in inches: " + metersToInches);

        // Display value in centimeter
        double inchesToCm = UnitConverter_05.convertInchesToCentimeters(metersToInches);
        System.out.println("Distance in centimeter: " + inchesToCm);

        // Display value in meter
        double inchesToMeters = UnitConverter_05.convertInchesToMeters(metersToInches);
        System.out.println("Distance in meters: " + inchesToMeters);

        // Display value in yards
        double feetToYards = UnitConverter_05.convertFeetToYards(metersToInches/12);
        System.out.println("Distance in yards: " + feetToYards);

        // Display value in feet
        double yardsToFeet = UnitConverter_05.convertYardsToFeet(feetToYards);
        System.out.println("Distance in feet: " + yardsToFeet);


        // Close the Scanner object
        input.close();
    }

}