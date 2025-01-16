import java.util.Scanner;

public class BMIcalculator_01 {

    // Method to calculate the BMI and status based on weight and height
    public static String[] calculateBMI(double weight, double height) {
        // Convert height from cm to meters
        double heightInMeters = height / 100.0;

        // BMI calculation
        double bmi = weight / (heightInMeters * heightInMeters);

        // Round the BMI to two decimal places
        bmi = Math.round(bmi * 100.0) / 100.0;

        // Determine the status based on BMI
        String status;
        if (bmi < 18.5) {
            status = "Underweight";
        } else if (bmi < 24.9) {
            status = "Normal";
        } else if (bmi < 39.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        // Return the BMI and status as a string array
        return new String[] { String.valueOf(weight), String.valueOf(height), String.valueOf(bmi), status };
    }

    // Method to process multiple persons' data and calculate BMI & Status
    public static String[][] processBMIData(double[][] data, int numberOfPersons) {
        String[][] result = new String[numberOfPersons][4];

        for (int i = 0; i < numberOfPersons; i++) {
            double weight = data[i][0];
            double height = data[i][1];

            // Call the calculateBMI method to get BMI and status
            result[i] = calculateBMI(weight, height);
        }

        return result;
    }

    // Method to display the result in a tabular format using println
    public static void displayBMIResult(String[][] bmiData) {
        // Display the table header
        System.out.println("---------------------------------------------------------");
        System.out.println("Person     Weight(kg)   Height(cm)   BMI       Status");
        System.out.println("---------------------------------------------------------");

        // Display each person's data
        for (int i = 0; i < bmiData.length; i++) {
            // Print the person number, weight, height, BMI, and status
            System.out.print("Person " + (i + 1));

            // Add spaces to align the columns properly
            for (int j = 0; j < 12 - ("Person " + (i + 1)).length(); j++) {
                System.out.print(" ");
            }

            System.out.print(bmiData[i][0]); // Weight
            for (int j = 0; j < 12 - bmiData[i][0].length(); j++) {
                System.out.print(" ");
            }

            System.out.print(bmiData[i][1]); // Height
            for (int j = 0; j < 12 - bmiData[i][1].length(); j++) {
                System.out.print(" ");
            }

            System.out.print(bmiData[i][2]); // BMI
            for (int j = 0; j < 10 - bmiData[i][2].length(); j++) {
                System.out.print(" ");
            }

            System.out.println(bmiData[i][3]); // Status
        }

        System.out.println("---------------------------------------------------------");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfPersons = 10; // Number of people in the team
        double[][] data = new double[numberOfPersons][2]; // 2D array to store weight and height

        // Take user input for weight and height
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println("Enter details for Person " + (i + 1));

            System.out.print("Enter weight (kg): ");
            data[i][0] = input.nextDouble(); // Weight in kg

            System.out.print("Enter height (cm): ");
            data[i][1] = input.nextDouble(); // Height in cm

            System.out.println();
        }

        // Process the BMI data
        String[][] bmiData = processBMIData(data, numberOfPersons);

        // Display the result
        displayBMIResult(bmiData);

        input.close();
    }
}