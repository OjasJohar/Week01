import java.util.Scanner;

public class ComputeScore_12 {
    
    // Method to generate random 2-digit scores for Physics, Chemistry, and Math
    public static int[][] generateRandomScores(int numStudents) {
        int[][] scores = new int[numStudents][3]; // 3 subjects: Physics, Chemistry, Math
        
        for (int i = 0; i < numStudents; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = (int) (Math.random() * 90) + 10; // Random number between 10 and 99
            }
        }
        
        return scores;
    }

    // Method to calculate total, average, and percentage for each student
    public static double[][] calculateTotalsAndPercentages(int[][] scores) {
        double[][] result = new double[scores.length][4]; // Total, Average, Percentage, and blank column for future use
        
        for (int i = 0; i < scores.length; i++) {
            int total = 0;
            for (int j = 0; j < 3; j++) {
                total += scores[i][j];
            }
            
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;
            
            // Store rounded values in the result array
            result[i][0] = Math.round(total * 100.0) / 100.0; // Rounded total
            result[i][1] = Math.round(average * 100.0) / 100.0; // Rounded average
            result[i][2] = Math.round(percentage * 100.0) / 100.0; // Rounded percentage
        }
        
        return result;
    }

    // Method to display the scorecard in tabular format
    public static void displayScorecard(int[][] scores, double[][] result) {
        // Printing the header
        System.out.println("Student No.\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage");
        System.out.println("------------------------------------------------------------");
        
        for (int i = 0; i < scores.length; i++) {
            System.out.print((i + 1) + "\t\t"); // Student number
            
            // Display scores for each subject
            for (int j = 0; j < 3; j++) {
                System.out.print(scores[i][j] + "\t\t");
            }
            
            // Display total, average, and percentage
            System.out.print(result[i][0] + "\t\t");
            System.out.print(result[i][1] + "\t\t");
            System.out.println(result[i][2] + "%");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Take input for number of students
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        
        // Generate random scores for each student
        int[][] scores = generateRandomScores(numStudents);
        
        // Calculate total, average, and percentage for each student
        double[][] result = calculateTotalsAndPercentages(scores);
        
        // Display the scorecard
        displayScorecard(scores, result);
        
        scanner.close();
    }
}