import java.util.Scanner;

public class PCM_08 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take input for the number of students
        System.out.print("Enter the number of students: ");
        int n = input.nextInt();

        //Create arrays to store marks, percentages, and grades
        double[] physics = new double[n]; 
        double[] chemistry = new double[n]; 
        double[] maths = new double[n]; 
        double[] percentages = new double[n]; // percentages[i] = percentage for student i
        String[] grades = new String[n]; // grades[i] = grade for student i

        //Take input for marks in physics, chemistry, and maths
        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks for student " + (i + 1) + ":");

            // Input for physics marks
            double physicsMarks;
            do {
                System.out.print("Physics marks: ");
                physicsMarks = input.nextDouble();
                if (physicsMarks < 0) {
                    System.out.println("Marks cannot be negative. Please enter again.");
                }
            } while (physicsMarks < 0);

            // Input for chemistry marks
            double chemistryMarks;
            do {
                System.out.print("Chemistry marks: ");
                chemistryMarks = input.nextDouble();
                if (chemistryMarks < 0) {
                    System.out.println("Marks cannot be negative. Please enter again.");
                }
            } while (chemistryMarks < 0);

            // Input for maths marks
            double mathsMarks;
            do {
                System.out.print("Maths marks: ");
                mathsMarks = input.nextDouble();
                if (mathsMarks < 0) {
                    System.out.println("Marks cannot be negative. Please enter again.");
                }
            } while (mathsMarks < 0);

            // Store the marks in the marks array
            physics[i] = physicsMarks;
            chemistry[i] = chemistryMarks;
            maths[i] = mathsMarks;

            // Calculate the percentage
            double totalMarks = physicsMarks + chemistryMarks + mathsMarks;
            double percentage = (totalMarks / 300) * 100;
            percentages[i] = percentage;

            // Calculate the grade based on the percentage
            if (percentage >= 80) {
                grades[i] = "A";
            } else if (percentage >= 70) {
                grades[i] = "B";
            } else if (percentage >= 60) {
                grades[i] = "C";
            } else if (percentage >= 50) {
                grades[i] = "D";
            } else if (percentage >= 40) {
                grades[i] = "E";
            } else {
                grades[i] = "R";
            }
        }

        // Display the marks, percentages, and grades for each student
        System.out.println("Marks and Percentage of each students are as follow:");
        for (int i = 0; i < n; i++) {
           System.out.println("\nStudent " + (i+1) + ":");
           System.out.println("Physics marks: " + physics[i]);
           System.out.println("chemistry marks: " + chemistry[i]);
           System.out.println("maths marks: " + maths[i]);
           System.out.println("percentage : " + percentages[i] + "%");
           System.out.println("grade : " + grades[i]);
          
        }

        input.close();
    }
}