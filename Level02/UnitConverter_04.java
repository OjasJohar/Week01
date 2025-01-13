import java.util.Scanner;

public class UnitConverter_04 {

    // Method To convert kilometers to miles and return the value
    public static double convertKmToMiles(double km) {
        // Convert km to miles
        double km2miles = 0.621371;
        double miles = km * km2miles;

        // return the value
        return miles;
    }

    // Method To convert miles to kilometer and return the value
    public static double convertMilesToKm(double miles) {
        // Convert miles to km
        double miles2km = 1.60934;
        double km = miles * miles2km;

        // return the value
        return km;
    }

    // Method To convert Meter to Feet and return the value
    public static double convertMeterToFeet(double meter) {
        // Convert meter to feet
        double meters2feet = 3.28084;
        double feet = meter * meters2feet;

        // return the value
        return feet;
    }

    // Method To convert Feet to meter and return the value
    public static double convertFeetToMeter(double feet) {
        // Convert feet to meter
        double feet2meters = 0.3048;
        double meter = feet * feet2meters;

        // return the value
        return meter;
    }

    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Take input for km
        System.out.print("Enter the distance in kilometers: ");
        double km = input.nextDouble();

        // Call the method to convert km to miles
        double miles = UnitConverter_04.convertKmToMiles(km);

        // Call the method to convert  miles to km
        double kilometer = UnitConverter_04.convertMilesToKm(miles);

        // Call the method to convert meter to feet
        double m=km*1000;
        double feet = UnitConverter_04.convertMeterToFeet(m);
        
        // Call the method to convert feet to meter
        double meter = UnitConverter_04.convertFeetToMeter(feet);

        // Display value in miles
        System.out.println("Distance in miles: " + miles);

        // Display value in kilometer
        System.out.println("Distance in kilometer: " + kilometer);

        // Display value in meter
        System.out.println("Distance in meter: " + meter);

        // Display value in feet
        System.out.println("Distance in feet: " + feet);

        // Close the Scanner object
        input.close();
    }
}