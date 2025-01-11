import java.util.Scanner;

public class BMI_06 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Take input for the number of persons
        System.out.print("Enter the number of persons: ");
        int n = input.nextInt();

        // Arrays to store weight, height, BMI, and weight status
        double[] weights = new double[n];
        double[] heights = new double[n];
        double[] bmis = new double[n];
        String[] statuses = new String[n];

        //Take input for weight and height of each person
        for (int i = 0; i < n; i++) {
            System.out.print("Enter weight (in kg) for person " 
			+(i + 1) + ": ");
            weights[i] = input.nextDouble();
            System.out.print("Enter height (in meters) for person " 
			+(i + 1) + ": ");
            heights[i] = input.nextDouble();
        }

        //Calculate BMI and determine weight status
        for (int i = 0; i < n; i++) {
            // Calculate BMI
            bmis[i] = weights[i] / (heights[i] * heights[i]);

            // Determine weight status
            if (bmis[i] < 18.5) {
                statuses[i] = "Underweight";
            } else if (bmis[i] < 24.9) {
                statuses[i] = "Normal";
            } else if (bmis[i] < 29.9) {
                statuses[i] = "Overweight";
            } else {
                statuses[i] = "Obese";
            }
        }

        // Display the height, weight, BMI, and weight status of each person
        System.out.println("\n--- BMI Report ---");
        System.out.println("Person\tHeight (m)\tWeight (kg)\tBMI\t\tStatus");
		
        for(int i = 0; i < n; i++) {
            System.out.println(  (i + 1) + "\t" + heights[i] + "\t\t" 
			+weights[i] + "\t\t" +  bmis[i] + "\t\t1" +  statuses[i]);
        }

        input.close();
    }
}