import java.util.Scanner;

public class BMI_10 {

    // Method to calculate BMI for each person and populate the 2D array
    public static void calculateBMI(double[][] data) {
        // Loop through all 10 persons
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0]; // weight in kg
            double heightInCm = data[i][1]; // height in cm
            double heightInMeters = heightInCm / 100; // Convert height to meters

            // BMI formula: BMI = weight / (height * height)
            double bmi = weight / (heightInMeters * heightInMeters);
            data[i][2] = bmi; // Store BMI in the third column of the 2D array
        }
    }

    // Method to determine BMI status and return an array of status
    public static String[] determineBMIStatus(double[][] data) {
        String[] status = new String[10]; // Array to store the BMI status of all persons

        // Loop through all 10 persons
        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2]; // Get the BMI of the person

            if (bmi < 18.5) {
                status[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi < 24.9) {
                status[i] = "Normal weight";
            } else if (bmi >= 25 && bmi < 29.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obesity";
            }
        }

        return status; // Return the BMI status array
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 2D array to store weight (kg), height (cm), and BMI for each person
        double[][] data = new double[10][3];

        // Input the weight (kg) and height (cm) for 10 persons
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            data[i][0] = input.nextDouble();
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            data[i][1] = input.nextDouble();
        }

        // Calculate BMI for all persons
        calculateBMI(data);

        // Determine BMI status for all persons
        String[] status = determineBMIStatus(data);

        // // Display the height, weight, BMI, and status for each person
        for (int i = 0; i < 10; i++) {

            System.out.println("Person " + (i + 1) + "  " +
                    "Weight: " + data[i][0] + " kg  " +
                    "Height: " + data[i][1] + " cm  " +
                    "BMI: " + data[i][2] + "  " +
                    "Status: " + status[i]);
        }

        //Closing the Scanner class
        input.close();
    }
}