import java.util.Scanner;

public class MultiDimensionalArray_07 {

    public static void main(String[] args) {

        //Creating Scanner object
		Scanner input = new Scanner(System.in);

        // Take input for the number of persons
        System.out.print("Enter the number of persons: ");
        int n = input.nextInt();

        //Create a 2D array to store weight, height, and BMI of each person
        double[][] personData = new double[n][3];  // personData[i][0] = weight, personData[i][1] = height, personData[i][2] = BMI
        String[] weightStatus = new String[n];  // Array to store the weight status of each person

        //Take input for weight and height of each person, ensuring positive values
        for(int i = 0; i < n; i++){
            // Input for weight
            double weight;
            do {
                System.out.print("Enter weight (in kg) for person " + (i + 1) + ": ");
                weight = input.nextDouble();
                if (weight <= 0) {
                    System.out.println("Weight must be a positive number. Please enter again.");
                }
            } while (weight <= 0);

            // Input for height
            double height;
            do {
                System.out.print("Enter height (in meters) for person " + (i + 1) + ": ");
                height = input.nextDouble();
                if (height <= 0) {
                    System.out.println("Height must be a positive number. Please enter again.");
                }
            } while (height <= 0);

            // Store weight and height in the personData array
            personData[i][0] = weight;  // Store weight in column 0
            personData[i][1] = height;  // Store height in column 1

            // Calculate BMI and store in the personData array
            double bmi = weight / (height * height);
            personData[i][2] = bmi;

            // Determine the weight status based on BMI
            if (bmi < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi < 24.9) {
                weightStatus[i] = "Normal";
            } else if (bmi < 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Display the height, weight, BMI, and weight status for each person
        System.out.println("\n--- BMI Report ---");
        System.out.println("Person\tHeight (m)\tWeight (kg)\tBMI\t\t\t\tStatus");
        for (int i = 0; i < n; i++) {
            System.out.println(  (i + 1) + "\t" + personData[i][1] + "\t\t" +personData[i][0] 
			+ "\t\t" + personData[i][2] + "\t\t1" +  weightStatus[i]);
        }

        input.close();
    }
}